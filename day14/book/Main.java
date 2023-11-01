package book;

import java.util.Scanner;

// 사용자와 상호작용(입출력)
// 입력값에 따라서 handler의 함수를 호출
public class Main {
	public static void main(String[] args) {
		int menu;
		String name;
		String writer;
		int bookNum;
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in); 
		
		LOOP : while(true) {
			System.out.println("도서 관리 프로그램");
			System.out.println("1.현재 도서 현황");
			System.out.println("2.책 대여");
			System.out.println("3.책 반납");
			System.out.println("0.종료");
			System.out.print("입력 >>>>> \n");
			
			menu = Integer.parseInt(sc.nextLine());
			switch(menu){
				case 1 :
					handler.bookMenu();
					break;
				case 2 :
					handler.bookMenu();
					System.out.println("대여할 책 번호를 입력 : ");
					bookNum = Integer.parseInt(sc.nextLine());
					handler.bookBorrow(bookNum);
					break;
				case 3 :
					System.out.print("반납할 책 이름을 입력 : ");
					name = sc.nextLine();
					System.out.print("작가를 입력 : ");
					writer = sc.nextLine();
					handler.bookReturn(name,writer);
					break;
				
				case 0 :
					sc.close();
					System.out.println("프로그램 종료");
					break LOOP;
				
				default :
					System.out.println("잘못 입력하였습니다");
			}
		}
		
		
		
		
	}
}
