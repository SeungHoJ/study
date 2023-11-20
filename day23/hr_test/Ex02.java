package hr_test;

import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		
		JdbcTemplate template = new JdbcTemplate();
		String sql = "select tname from tab";
		RowMapper<String> mapper = (rs)->{		// 단일 객체(단일 레코드, 줄)에 대한 맵핑규칙이다
			return rs.getString("tname");
		};
		
		List<String> tableNameList = template.queryForList(sql, mapper);
		
		tableNameList.forEach(ob -> System.out.println(ob));
		
					
					
					
					
	}
}
