package book6;

import java.sql.*;	// 자바에서 DB에 접속하기 위한 클래스를 가져온다
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

public class BookDAO {
	private Connection conn;	// 접속 1단계, 네트워크및 포트 접속을 확인한다
//	private Statement stmt;		// 접속 2단계, 접속된 DB프로그램이 작업을 수행할 수 있는 상태인지 확인
	private PreparedStatement pstmt;
	private ResultSet rs;		// 만약 수행하는 쿼리가 select이면 결과를 받아서 저장한다
								// insert, update, delete는 결과를 int 형태로 반환한다
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String username = "c##itbank";
	private String password = "it";
	
	public BookDAO() {
		try {
			Class.forName(OracleDriver.class.getName());
			conn = DriverManager.getConnection(url,username,password);
			
			
		}catch(SQLException e) {
			System.out.println("SQL 접속 예외 : " + e);
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			System.out.println("클래스를 불러올 수 없습니다 : " + e);
			e.printStackTrace();
		}
	}
	
	// 전체 목록 불러오기
	public ArrayList<BookDTO> selectlist(){
		// conn -> stmt -> rs/row
		ArrayList<BookDTO> list = new ArrayList<>();
		String sql = "select * from book";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookDTO dto = new BookDTO();
				dto.setAuthor(rs.getString("author"));
				dto.setName(rs.getString("name"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setPrice(rs.getInt("price"));
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("selectList 예외 발생 : " + e);
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			}catch(SQLException e){}
			
		}
		return list;		// 리스트 반환
	}
	
	public int insertBook(BookDTO dto){
		int row = 0;
//		String sql = "insert into book values('"+dto.getName()+"')";
//		쿼리문에 내가 값을 입력해야 하는 내용이 많으면
//		따옴표 처리 및 자료형 처리가 불편해진다
//		기존의 Statement는 이런 기능이 없어서
//		PreparedStatement를 이용하면 순서대로 값을 넣을 수 있는데
//		사용하는 형식은 printf()와 유사하다
		String sql = "insert into book values(?,?,?,?)";
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());	// setString은 따옴표처리도 자동으로 수행한다
			pstmt.setString(2, dto.getAuthor());
			pstmt.setString(3, dto.getPublisher());
			pstmt.setInt(4, dto.getPrice());	// setInt는 따옴표를 처리하지 않는다
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insertBook 예외 발생 : " + e);
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			}catch(SQLException e){}
			
		}
		return row;
	}
	


	public int deleteBook(String deleteName) {
		int row = 0;
		String sql = "delete from book where name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, deleteName);
			row = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}
}
