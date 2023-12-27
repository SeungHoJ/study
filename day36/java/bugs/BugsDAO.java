package bugs;

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

public class BugsDAO {
	// 싱글톤 : 페이지마다 같은 기능을 하는 서로 다른객체가 생기지 않도록 처리
	// 생성자
	private static BugsDAO instance = new BugsDAO();
	public static BugsDAO getInstance() {
		return instance;
	}
	

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Context init;
	private DataSource ds;
	// 커넥션풀 : 요청이 들어올때 마다 새로운 커넥션을 생성하지 말고
	// 			미리 충분히 사용할만큼의 커넥션을 생성해두고, 돌려가면서 사용하기 위해서
	
	private BugsDAO() {
		try {
			init = new InitialContext();
			ds = (DataSource)init.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			System.out.println("지정한 이름의 객체를 차을 수 없습니다" + e);
		}finally {
			if(conn != null) try { conn.close();} catch (SQLException e) {}
		}
	}
	
	private void close() {
		
		try {
			if(rs != null)rs.close();
			if(pstmt != null)pstmt.close();
			if(conn != null)conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
}

	private BugsDTO mapping(ResultSet rs) throws SQLException {
		BugsDTO dto = new BugsDTO();
		dto.setId(rs.getInt("id"));
		dto.setAlbum_img(rs.getString("album_img"));
		dto.setAlbum_name(rs.getString("album_name"));
		dto.setArtist_img(rs.getString("artist_img"));
		dto.setArtist_name(rs.getString("artist_name"));
		dto.setGenre(rs.getString("genre"));
		dto.setIsTitle(rs.getInt("isTitle"));
		dto.setLyrics(rs.getString("lyrics"));
		dto.setName(rs.getString("name"));
		dto.setPlayTime(rs.getInt("playTime"));
		
		return dto;		
	}
	
	public List<BugsDTO> selectAll(String search){
		ArrayList<BugsDTO> list = new ArrayList<BugsDTO>();
		String sql = "select * from bugs"
				+ "    where"
				+ "        name like '%' || ? || '%'"
				+ "        or"
				+ "        artist_name like '%' || ? || '%'"
				+ "    order by"
				+ "        artist_name,"
				+ "        name";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, search);
			pstmt.setString(2, search);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(mapping(rs));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();}
		System.out.println("불러온 목록의 개수 : " + list.size());
		return list;
	}
}