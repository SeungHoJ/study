package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class LoginDAO {

	private String user = "itbank";
	private String password = "it";
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Connection getConnection() throws Exception {
		Class.forName(OracleDriver.class.getName());
		
		return DriverManager.getConnection(url,user,password);
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
			conn = getConnection();
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
			conn = getConnection();
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

}
