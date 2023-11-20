package book2;

import java.util.Scanner;

public class Main {
	
	static void showList(Book[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.printf("%s (%s,%s) : %,d원\n", arr[i].getName(), arr[i].getAuthor(), arr[i].getPublisher(),
						arr[i].getPrice());
			}
		}
	}
	static Book getBookFromUserInput(Scanner sc) {
		Book book = new Book();
		String name;
		String author;
		String publisher;
		int price;
		
		System.out.print("도서 제목 입력 : ");
		name = sc.nextLine();

		System.out.print("작가 입력 : ");
		author = sc.nextLine();

		System.out.print("출판사 입력 : ");
		publisher = sc.nextLine();

		System.out.print("가격 입력 : ");
		price = Integer.parseInt(sc.nextLine());
		
		book.setName(name);
		book.setAuthor(author);
		book.setPublisher(publisher);
		book.setPrice(price);
		
		return book;
	}
	static void deleteBook(Book[] arr,String name) {
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i].getName()).equals(name)) {
				System.out.printf("%s을(를) 삭제 완료했습니다.\n", arr[i].getName());
				arr[i] = null;
			}
		}
	}
	public static void main(String[] args) {

		String name, author, publisher;
		int price;

		Book[] arr = new Book[10];
		Scanner sc = new Scanner(System.in);

		int menu;
		MAIN: while (true) {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());

			Book book = new Book();
			switch (menu) {
			case 1:
				showList(arr);
				break;
			case 2:
				book  = getBookFromUserInput(sc);

				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == null) {
						arr[i] = book;
						break;
					}
				}
				break;
			case 3:
				System.out.print("수정할 도서 제목 입력 : ");
				String searchName = sc.nextLine();

				for (int i = 0; i < arr.length; i++) {
					if ((arr[i].getName()).contains(searchName)) {
						System.out.printf("%s (%s,%s) : %,d원\n", arr[i].getName(), arr[i].getAuthor(), arr[i].getPublisher(),
								arr[i].getPrice());
						break;
					}
				}
				System.out.println("1. 도서 제목");
				System.out.println("2. 작가");
				System.out.println("3. 출판사");
				System.out.println("4. 가격");
				System.out.println("수정할 목록 번호를 입력 : ");
				menu = Integer.parseInt(sc.nextLine());
				switch (menu) {
				case 1:
					System.out.println("변경할 도서 제목을 입력 : ");
					name = sc.nextLine();
					for (int i = 0; i < arr.length; i++) {
						if ((arr[i].getName()).contains(searchName)) {
							arr[i].setName(name);
							break;
						}
					}
					System.out.println("변경이 완료되었습니다");
					break;
				case 2:
					System.out.println("변경할 작가 이름을 입력 : ");
					author = sc.nextLine();
					for (int i = 0; i < arr.length; i++) {
						if ((arr[i].getName()).contains(searchName)) {
							arr[i].setAuthor(author);
							break;
						}
					}
					System.out.println("변경이 완료되었습니다");
					break;
				case 3:
					System.out.println("변경할 출판사 이름을 입력 : ");
					publisher = sc.nextLine();
					for (int i = 0; i < arr.length; i++) {
						if ((arr[i].getName()).contains(searchName)) {
							arr[i].setPublisher(publisher);
							break;
						}
					}
					System.out.println("변경이 완료되었습니다");
					break;
				case 4:
					System.out.println("변경할 가격을 입력 : ");
					price = Integer.parseInt(sc.nextLine());
					for (int i = 0; i < arr.length; i++) {
						if ((arr[i].getName()).contains(searchName)) {
							arr[i].setPrice(price);
							break;
						}
					}
					System.out.println("변경이 완료되었습니다");
					break;
				default:
					System.out.println("잘못된 입력입니다");
				}
				break; // end of case 3
			case 4:
				System.out.print("삭제할 도서 제목 입력 : ");
				String deleteName = sc.nextLine();

				deleteBook(arr, deleteName);
				break;
			case 0:
				break MAIN;
			}

		}
		sc.close();
		System.out.println("프로그램 종료");

	}
}
