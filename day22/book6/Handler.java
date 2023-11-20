package book6;


import java.util.List;


public class Handler {


	void showList() {
		BookDAO dao = new BookDAO();
		List<BookDTO> list = dao.selectlist();
		list.forEach(ob -> System.out.println(ob));

	}
	
	
	public int insertBook(BookDTO ob) {
		int row = 0;
		BookDAO dao = new BookDAO();
		row = dao.insertBook(ob);		// 메인이 넘겨준 객체를 dao로 전달하여 추가한다
		return row;						// 추가 결과 정수를 다시 메인으로 반환한다
	}
	
	public int deleteBook(String deleteName) {
		int row = 0;
		BookDAO dao = new BookDAO();
		row = dao.deleteBook(deleteName);
		return row;
	}
	
	public int updateBook(String name) {
		int row = 0;
		BookDAO dao = new BookDAO();
		List<BookDTO> list = dao.selectlist();
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).equals(name)) {
				System.out.printf("%s (%s,%s) : %,d원\n", list.get(i).getName(), list.get(i).getAuthor(), list.get(i).getPublisher(),
				list.get(i).getPrice());
				row++;
				break;
			}
		}
		return row;
	}
	
	public int updateBookFromName(String searchName,String changeName) {
		int row = 0;
		BookDAO dao = new BookDAO();
		List<BookDTO> list = dao.selectlist();
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).contains(searchName)) {
				list.get(i).setName(changeName);
				row++;
				break;
			}
		}
		return row;
	}
	
	public int updateBookFromAuthor(String searchName,String name) {
		int row = 0;
		BookDAO dao = new BookDAO();
		List<BookDTO> list = dao.selectlist();
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).contains(searchName)) {
				list.get(i).setAuthor(name);
				row++;
				break;
			}
		}
		return row;
	}
	
	public int updateBookFromPublisher(String searchName,String name) {
		int row = 0;
		BookDAO dao = new BookDAO();
		List<BookDTO> list = dao.selectlist();
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).contains(searchName)) {
				list.get(i).setPublisher(name);
				row++;
				break;
			}
		}
		return row;
	}
	
	public int updateBookFromPrice(String searchName,int price) {
		int row = 0;
		BookDAO dao = new BookDAO();
		List<BookDTO> list = dao.selectlist();
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).contains(searchName)) {
				list.get(i).setPrice(price);
				row++;
				break;
			}
		}
		return row;

	}
}
	

