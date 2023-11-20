package hr_test;

public class Ex01 {
	public static void main(String[] args) {
		// select banner from v$version
		// 단일 문자열을 불러와서 출력하기
		
		JdbcTemplate template = new JdbcTemplate();
		
		// param1 : 실행할 sql을 준비한다
		String sql = "select banner from v$version";
		
		// 단일 데이터를 불러오는 queryForObject 함수를 사용한다
		// sql과 RowMapper 객체를 전달하면 된다
		// RowMapper객체는 결과를 rs에 불러왔을 때 어떤 형식으로 맵핑할지 결정해서
		// 추상메스드를 오버라이딩으로 구혀나는 형태로 만들어주면 된다
		RowMapper<String> mapper = rs -> rs.getString("banner");
		
		String result = template.queryForObject(sql, mapper);	
		
		System.out.println(result);
		
		
		
		
		
		
	}
}