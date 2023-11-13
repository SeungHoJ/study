package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO {	// Data Access Object
		private Connection conn;
		private Statement stmt;
		private ResultSet rs;
		
		private final String url ="jdbc:oracle:thin:@192.168.1.100:1521:xe";
		private final String username = "hr";
		private final String password = "hr";
		
		private final String dirverName = "oracle.jdbc.driver.OracleDriver";
		
		public DAO() { // DAO객체를 생성하면 드라이버 로드 및 연결을 수행한다 (객체 생성 시 초기작동)
			try {
				Class.forName(dirverName);
				conn = DriverManager.getConnection(url,username,password);
				
			}catch(ClassNotFoundException e) {
				System.out.println("드라이버 이름이 잘못되었습니다 : " + e);
			}catch(SQLException e) {
				System.out.println("DB에 접속하는데 문제가 발생했습니다 : " + e);
			}
		}
		
		// DB에 접속하여 직원의 이름과 급여를 가져와서 리스트 형태로 반환하는 함수
		public List<DTO> getQueryFromEmployees() throws SQLException{
			ArrayList<DTO> list = new ArrayList<DTO>();
			String sql = "select first_name,salary from employees";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				DTO dto = new DTO();
				dto.setFirstName(rs.getString("first_name"));
				dto.setSalary(rs.getInt("salary"));
				list.add(dto);
			}
			// 연결을 종료할 때는 접속의 역순으로 끊어준다
			rs.close();
			stmt.close();
			conn.close();
			return list;
		}
		
		// DB에 접속하여 직원의 이름과 급여를 가져와서 리스트 형태로 반환하는 함수
		public List<DTO> getQueryFromEmployeesBy5person() throws SQLException{
				ArrayList<DTO> list = new ArrayList<>();
				String sql = "select first_name,salary from employees order by salary desc fetch first 5 rows only";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
						// 빈 객체를 생성한다
					DTO dto = new DTO();
						
						// DB에서 first_name을 문자열 형태로 가져워서 객체에 저장한다
					dto.setFirstName(rs.getString("first_name"));
						
						// DB에서 salary를 정수형태로 가져와서 객체에 저장한다
					dto.setSalary(rs.getInt("salary"));
						
						// 객체를 리스트에 추가한다
					list.add(dto);
					}
					// 연결을 종료할 때는 접속의 역순으로 끊어준다
					rs.close();
					stmt.close();
					conn.close();
					return list;
				}

	}		// end of DAO

