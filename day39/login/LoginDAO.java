package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import oracle.jdbc.driver.OracleDriver;

/*
 	DAO는 DB에 접속하기 위해 Connection이 필요하다
 	Connection을 미리 생성하여 관리하는 DataSource객체는 context.xml에 정의되어 있다
 	미리 준비한 DataSource를 자바 객체로 불러오기 위해서는 Context를 객체화해서 불러와야한다
 	Connection 이후에는 이전 수너대로 PreparedStatement, ResultSet 등이 필요하다
 	
 	1) context.xml 의 내용을 자바객체로 불러온다. new InitialContext();
 	2) context.xml 에 작성한 DataSource 객체를 지정한 이름 "jdbc/oracle"로 불러온다
 	3) context.xml 에 정의한 객체는 이름 앞에 접두ㅏ를 붙여야 한다 "java:comp/env/"
 	4) Object

 */

public class LoginDAO {

	private Context init;
	private DataSource ds;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static LoginDAO instance = new LoginDAO();
	
	public static LoginDAO getInstance() {

		return instance;
	}
	
	private LoginDAO() {

		try {
			init = new InitialContext();
			ds = (DataSource)init.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
	
	private void close() {

		
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();}
	}

	private LoginDTO mapping(ResultSet rs) {

		LoginDTO dto = new LoginDTO();
		try {
			dto.setUserid(rs.getString("userid"));
			dto.setUserpw(rs.getString("userpw"));
			dto.setUsername(rs.getString("username"));
			dto.setGender(rs.getString("gender"));
			dto.setEmail(rs.getString("email"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dto;
	}
	
	public LoginDTO login(String userid,String userpw) {

		LoginDTO dto= null;
		String sql = "select * from member where userid = ? and userpw=?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, userpw);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dto = mapping(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return dto;
	}
	
	public int add(LoginDTO dto) {
		int row = 0;
		String sql = "insert into member values (?,?,?,?,?)";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUserid());
			pstmt.setString(2, dto.getUserpw());
			pstmt.setString(3, dto.getUsername());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getEmail());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return row;
	}

	public int delete(String userid) {
		int row = 0;
		String sql = "delete member where userid = ?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return row;
	}
	
	public int modify(LoginDTO dto) {
		int row = 0;
		String sql = "update member set userpw = ?, username = ?, gender = ?, email = ? where userid = ?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUserpw());
			pstmt.setString(2, dto.getUsername());
			pstmt.setString(3, dto.getGender());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getUserid());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			close();
		}
		return row;
	}

	public List<LoginDTO> selectAll(){
		List<LoginDTO> list = new ArrayList<LoginDTO>();
		String sql = "select * from member order by userid";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				LoginDTO dto= new LoginDTO();
				dto = mapping(rs);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return list;
	}

}	
