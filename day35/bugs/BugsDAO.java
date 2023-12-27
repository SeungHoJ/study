package bugs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

public class BugsDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "c##itbank";
	private String password = "it";
	
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
			conn = getConnection();
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
	
	public BugsDTO selectOne(int id) {
		BugsDTO dto = null;
		String sql = "select * from bugs where id = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dto = mapping(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			close();
		}
		return dto;
	}
	
	public int modify(BugsDTO dto) {
		int row = 0;
		String sql = "update bugs set artist_name=?, album_name=?, name=?, genre=?, playTime=?, lyrics=?, isTitle=? where id=? ";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getArtist_name());
			pstmt.setString(2, dto.getAlbum_name());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getGenre());
			pstmt.setInt(5, dto.getPlayTime());
			pstmt.setString(6, dto.getLyrics());
			pstmt.setInt(7, dto.getIsTitle());
			pstmt.setInt(8, dto.getId());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return row;
	}
}
