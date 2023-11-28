package schedule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

public class ScheduleDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "c##itbank";
	private String password = "it";
	
	public Connection getConnection() {
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
	
	private void close() {	// 자주 사용되고 내용이 똑같거나, 일정구간만 다르다면 함수로 묶어서 처리하기
		try {
			if(rs != null)rs.close();
			if(pstmt != null)pstmt.close();
			if(conn != null)conn.close();
		}catch(Exception e) {
			
		}
	}
	
	public List<ScheduleDTO> selectAll(){	// 전체 출력
		ArrayList<ScheduleDTO> list = new ArrayList<>();
		String sql = "select * from schedule order by start_date asc";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ScheduleDTO dto = new ScheduleDTO();
				dto.setTitle(rs.getString("title"));
				dto.setStart_date(rs.getDate("start_date"));
				dto.setEnd_date(rs.getDate("end_date"));
				list.add(dto);
		}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
		
		return list;
	}

	public void showVersion() {		// 버전 출력
		
		String sql = "select banner from v$version";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String version = "";
				version = rs.getString("banner");
				System.out.println(version);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
		
		
	}

	public List<ScheduleDTO> searchByMonth(String month) {	// 월별 출력
		ArrayList<ScheduleDTO> list = new ArrayList<ScheduleDTO>();
		
		String sql = "select title,start_date,end_date from schedule where extract(year from start_date) = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, month);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				ScheduleDTO dto = new ScheduleDTO();
				dto.setTitle(rs.getString("title"));
				dto.setStart_date(rs.getDate("start_date"));
				dto.setEnd_date(rs.getDate("end_date"));
				list.add(dto);					
				
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
		
		
		return list;
	}	

	public String getSysdate() {
		
		String sql = "select sysdate from dual";
		String sysdate = null;
		
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				sysdate = rs.getString("sysdate");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{close();}
		
		
		
		return sysdate;
	}

	public int setSchedule(ScheduleDTO dto) {
		int row = 0;
		String sql = "insert into schedule values(?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(1, dto.getTitle());
			pstmt.setDate(2, new java.sql.Date( dto.getStart_date().getTime()));
			pstmt.setDate(3, new java.sql.Date(dto.getEnd_date().getTime()));
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {close();}
		
		
		return row;
	}

	public int deleteSchedule(String title) {
		int row = 0;
		String sql = "delete from schedule where title = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {close();}
		
		
		return row;
		
	}
}
