package phonebook1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		String name,pnum,favorite;
		int menu = -1;
		int row,age;
		
		MAIN : while(menu != 0) {
			System.out.println("메뉴 출력");
			System.out.println("1. 전체 목록");
			System.out.println("2. 추가");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 즐겨찾기 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.print("입력 >>>");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				handler.showList();
				break;
			case 2:
				System.out.print("추가할 이름 입력 : ");
				name = 	sc.nextLine();
				System.out.print("추가할 나이 입력 : ");
				age = 	Integer.parseInt(sc.nextLine());
				System.out.print("추가할 전화번호 입력 : ");
				pnum = 	sc.nextLine();
				System.out.print("즐겨찾기 여부(Y/N) : ");
				favorite = sc.nextLine();
				
				row = handler.update(name,pnum,age,favorite);
				System.out.println(row !=0 ? "추가성공":"추가실패");
				break;
			case 3:
				System.out.print("변경할 사람의 이름을 입력 : ");
				name = sc.nextLine();
				System.out.print("변경할 전화번호 입력 : ");
				pnum = sc.nextLine();
				row = handler.updatePnum(pnum,name);
				System.out.println(row !=0 ? "수정성공":"수정실패");
				break;
			case 4:
				System.out.print("변경할 사람의 이름을 입력 : ");
				name = sc.nextLine();
				row = handler.updateFavorite(name);
				System.out.println(row !=0 ? "수정성공":"수정실패");
				break;
			case 5:
				System.out.print("삭제할 사람의 이름을 입력 : ");
				name = sc.nextLine();
				row = handler.delete(name);
				System.out.println(row !=0 ? "삭제성공":"삭제실패");
				break;
			case 0:
				sc.close();
				break MAIN;
			}
			
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
	}
}
