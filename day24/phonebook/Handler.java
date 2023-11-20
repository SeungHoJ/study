package phonebook;

public class Handler {
	
	PhonebookDAO dao = new PhonebookDAO();
	
	public void showList() {
		dao.showList();
		
	}
	
	public int update(PhonebookDTO dto) {
		int row = 0;
		row = dao.update(dto);
		return row;	
	}
	
	public int updateForPnum(PhonebookDTO dto) {
		int row = 0;
		PhonebookDAO dao = new PhonebookDAO();
		row = dao.updateForPnum(dto);
		return row;
	}

	public int updateFavorite(int idx) {
		int row = 0;
		PhonebookDAO dao = new PhonebookDAO();
		row = dao.updateFavorite(idx);
		return row;
	}

	public int delete(int idx) {
		int row = 0;
		PhonebookDAO dao = new PhonebookDAO();
		dao.delete(idx);
		return row;
	}

	
}
