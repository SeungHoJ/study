package book1;

import java.util.Scanner;

public class Main {
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

			switch (menu) {
			case 1:
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null) {
						System.out.printf("%s (%s,%s) : %,d원\n", arr[i].name, arr[i].author, arr[i].publisher,
								arr[i].price);
					}
				}
				break;
			case 2:
				System.out.print("도서 제목 입력 : ");
				name = sc.nextLine();

				System.out.print("작가 입력 : ");
				author = sc.nextLine();

				System.out.print("출판사 입력 : ");
				publisher = sc.nextLine();

				System.out.print("가격 입력 : ");
				price = Integer.parseInt(sc.nextLine());

				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == null) {
						arr[i] = new Book();
						arr[i].name = name;
						arr[i].author = author;
						arr[i].publisher = publisher;
						arr[i].price = price;
						break;
					}
				}
				break;
			case 3:
				System.out.print("수정할 도서 제목 입력 : ");
				String searchName = sc.nextLine();

				for (int i = 0; i < arr.length; i++) {
					if ((arr[i].name).contains(searchName)) {
						System.out.printf("%s (%s,%s) : %,d원\n", arr[i].name, arr[i].author, arr[i].publisher,
								arr[i].price);
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
						if ((arr[i].name).contains(searchName)) {
							arr[i].name = name;
							break;
						}
					}
					System.out.println("변경이 완료되었습니다");
					break;
				case 2:
					System.out.println("변경할 작가 이름을 입력 : ");
					author = sc.nextLine();
					for (int i = 0; i < arr.length; i++) {
						if ((arr[i].name).contains(searchName)) {
							arr[i].author = author;
							break;
						}
					}
					System.out.println("변경이 완료되었습니다");
					break;
				case 3:
					System.out.println("변경할 출판사 이름을 입력 : ");
					publisher = sc.nextLine();
					for (int i = 0; i < arr.length; i++) {
						if ((arr[i].name).contains(searchName)) {
							arr[i].publisher = publisher;
							break;
						}
					}
					System.out.println("변경이 완료되었습니다");
					break;
				case 4:
					System.out.println("변경할 가격을 입력 : ");
					price = Integer.parseInt(sc.nextLine());
					for (int i = 0; i < arr.length; i++) {
						if ((arr[i].name).contains(searchName)) {
							arr[i].price = price;
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

				for (int i = 0; i < arr.length; i++) {
					if ((arr[i].name).contains(deleteName)) {
						System.out.printf("%s을(를) 삭제 완료했습니다.\n", arr[i].name);
						arr[i] = null;
						break;
					}
				}

				break;
			case 0:
				break MAIN;
			}

		}
		sc.close();
		System.out.println("프로그램 종료");

	}
}
