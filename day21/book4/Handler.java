package book4;

import java.util.ArrayList;

public class Handler {

	// 배열에서 리스트로 전환 (배열의 자료형은 리스트의 제네릭 타입이 된다)
	private ArrayList<Book> list = new ArrayList<>();

	void showList() {
//		// 1) index를 사용하는 for문
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		// 2) 향사된 for문 (index를 사용하지 않음)
//		for(Book ob : list) {
//			System.out.println(ob);
//		}
		// 3) 람다식 + 컬렉션 forEach()
		list.forEach(ob -> System.out.println(ob));
//		
//		// 메서드 참조
//		list.forEach(System.out::println);
	}
	
	
	public int insertBook(Book ob) {
		int row = 0;
		boolean flag = list.add(ob);
		row = flag ? 1:0;
		return row;
	}
	
	int deleteBook(String name) {
		int row = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if ((arr[i].getName()).equals(name)) {
//				System.out.printf("%s을(를) 삭제 완료했습니다.\n", arr[i].getName());
//				arr[i] = null;
//				row++;
//				break;
//			}
//		}
		boolean flag = list.removeIf(ob -> ob.getName().equals(name));
		row = flag ? 1:0;
		return row;
	}
	
	void updateBook(String name) {
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).equals(name)) {
				System.out.printf("%s (%s,%s) : %,d원\n", list.get(i).getName(), list.get(i).getAuthor(), list.get(i).getPublisher(),
						list.get(i).getPrice());
				break;
			}
		}
	}
	
	void updateBookFromName(String searchName,String changeName) {
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).contains(searchName)) {
				list.get(i).setName(changeName);
				break;
			}
		}
	}
	
	void updateBookFromAuthor(String searchName,String name) {
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).contains(searchName)) {
				list.get(i).setAuthor(name);
				break;
			}
		}
	}
	
	void updateBookFromPublisher(String searchName,String name) {
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).contains(searchName)) {
				list.get(i).setPublisher(name);
				break;
			}
		}
	}
	
	void updateBookFromPrice(String searchName,int price) {
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).contains(searchName)) {
				list.get(i).setPrice(price);
				break;
			}
		}

	}
	
}
