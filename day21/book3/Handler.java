package book3;

public class Handler {

	private Book[] arr = new Book[10];

	void showList() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.printf("%s (%s,%s) : %,d원\n", arr[i].getName(), arr[i].getAuthor(), arr[i].getPublisher(),
						arr[i].getPrice());
			}
		}
	}
	
	public int insertBook(Book ob) {
		int row = 0 ;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = ob;
				break;
			}
		}
		return row;
	}
	
	int deleteBook(String name) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i].getName()).equals(name)) {
				System.out.printf("%s을(를) 삭제 완료했습니다.\n", arr[i].getName());
				arr[i] = null;
				row++;
				break;
			}
		}
		return row;
	}
	
	void updateBook(String name) {
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i].getName()).equals(name)) {
				System.out.printf("%s (%s,%s) : %,d원\n", arr[i].getName(), arr[i].getAuthor(), arr[i].getPublisher(),
						arr[i].getPrice());
				break;
			}
		}
	}
	
	void updateBookFromName(String searchName,String name) {
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i].getName()).contains(searchName)) {
				arr[i].setName(name);
				break;
			}
		}
	}
	
	void updateBookFromAuthor(String searchName,String name) {
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i].getName()).contains(searchName)) {
				arr[i].setAuthor(name);
				break;
			}
		}
	}
	
	void updateBookFromPublisher(String searchName,String name) {
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i].getName()).contains(searchName)) {
				arr[i].setPublisher(name);
				break;
			}
		}
	}
	
	void updateBookFromPrice(String searchName,int price) {
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i].getName()).contains(searchName)) {
				arr[i].setPrice(price);
				break;
			}
		}

	}
	
}
