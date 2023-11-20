package phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

public class PhonebookDAO {
	private void close() {
		try {
			if(rs != null)rs.close();
			if(pstmt != null)pstmt.close();
			if(conn != null)conn.close();
		} catch (SQLException e) {
		}
	}

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String url ="jdbc:oracle:thin:@192.168.1.100:1521:xe"; 
	private String user = "c##itbank";
	private String password = "it";
	
	private Connection getConnection(){
		try {
			Class.forName(OracleDriver.class.getName());
			conn = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을수 없습니다"+ e);
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL 접속 예외 : " + e);
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public void showList() {
		ArrayList<PhonebookDTO> list = new ArrayList<PhonebookDTO>();
		String sql = "select * from phonebook order by favorite desc, name asc";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				PhonebookDTO dto = new PhonebookDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setPnum(rs.getString("pnum"));
				dto.setFavorite(rs.getString("favorite"));
				dto.setAge(rs.getInt("age"));
				list.add(dto);
			}
			list.forEach(ob -> System.out.println(ob));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
		
		
		
	}
	


	public int update(PhonebookDTO dto) {
		int row = 0;
		String sql = "insert into phonebook (name,pnum,age,favorite) values(?,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());;
			pstmt.setString(2, dto.getPnum());;
			pstmt.setInt(3, dto.getAge());;
			pstmt.setString(4, dto.getFavorite());;
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("SQL 접속 예외 : " + e);
			e.printStackTrace();
		}finally {close();}
		return row;
}
	


	public int updateForPnum(PhonebookDTO dto) {
		int row = 0;
		
		String sql = "update phonebook set pnum = ? where idx = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getPnum());
			pstmt.setInt(2, dto.getIdx());
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 접속 예외 : " + e);
			e.printStackTrace();
		}finally {close();}
		
		
		
		
		return row;
	}
	


	public int updateFavorite(int idx) {
		int row = 0;
		String sql = "update phonebook set (favorite decode('Y','N','N','Y') where idx = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {close();}
		return row;
	}


	public int delete(int idx) {
		int row = 0;
		String sql = "delete from phonebook where idx = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
		return row;
	}
	

	
	
}
