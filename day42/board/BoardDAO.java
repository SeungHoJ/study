package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class BoardDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Context init;
	private DataSource ds;
	
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance() {
		return instance;
	}
	
	
	private BoardDAO() {
		try {
			init = new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void close() {
		try {
			if(rs != null)rs.close();
			if(pstmt != null)pstmt.close();
			if(conn != null)conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private BoardDTO mapping(ResultSet rs) throws SQLException {
		BoardDTO dto = new BoardDTO();
		dto.setIdx(rs.getInt("idx"));
		dto.setTitle(rs.getString("title"));
		dto.setWriter(rs.getString("writer"));
		dto.setContent(rs.getString("content"));
		dto.setWriteDate(rs.getDate("writeDate"));
		return dto;
	}
	
	public List<BoardDTO> selectList() {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		String sql = "select * from board order by idx desc";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(mapping(rs));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return list;
	}
	
	public BoardDTO selectOne(int idx) {
		BoardDTO dto = null;
		String sql = "select * from board where idx = ?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
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
}
