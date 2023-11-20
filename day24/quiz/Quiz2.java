package quiz;

import java.sql.*;

import oracle.jdbc.driver.OracleDriver;


public class Quiz2 {
	public static void main(String[] args)throws Exception {
		
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "c##itbank";
		String password = "it";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Class.forName(OracleDriver.class.getName());
		conn = DriverManager.getConnection(url,user,password);
		
		String sql = "select sysdate from dual";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("sysdate"));
		}
		// 주어진 SQL문을 활용하여 실행한 시점의 시간을 화면에 출력하세요
		// 자료형은 문자열로 처리하면 됩니다
		rs.close();
		pstmt.close();
		conn.close();
	}
}
