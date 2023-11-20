package phonebook1;


import java.util.List;



public class Handler {
	JdbcTemplate template = new JdbcTemplate();
	
	String name,pnum,favorite;
	int age;
	
	public void showList() {
		String sql = "select * from phonebook order by favorite desc,name";
		RowMapper<PhonebookDTO> mapper = (rs) ->{
			PhonebookDTO dto = new PhonebookDTO();
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
			return dto;
		};
		
		List<PhonebookDTO> list = template.queryForList(sql, mapper);
		
		for(PhonebookDTO ob : list) {
			System.out.printf("%s 즐겨찾기 여부(%s) %d세 %s\n",ob.getName(),ob.getFavorite(),ob.getAge(),ob.getPnum());
			
		}
	}

	public int update(String name,String pnum,int age,String favorite) {
		int row = 0;
		String sql = "insert into phonebook values(?,?,?,?)";
		
		row = template.update(sql, name,pnum,age,favorite);
		return row;
	}

	public int updatePnum(String pnum,String name) {
		int row = 0;
		String sql = "update phonebook set pnum = ? where name = ? ";
		
		row = template.update(sql, pnum,name);
		return row;
	}

	public int updateFavorite(String name) {
		int row = 0;
		String sql = "update phonebook set favorite = decode(favorite,'Y','N','N','Y') where name = ?";
		
		row = template.update(sql,name);
		return row;
	}

	public int delete(String name) {
		int row = 0;
		String sql = "delete from phonebook where name = ?";
		
		row = template.update(sql, name);
		return row;
	}
	
	
	
}
