package loop;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int menu = 1;
		Scanner sc = new Scanner(System.in);
		
//		while(menu != 0)
		do	{		// 조건 따지지 말고, 일단 한번 실행해라 (최소 1회 실행을 보장한다)
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 종료");
			System.out.print("입력 >>> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 0: System.out.println("종료합니다"); break;
			case 1: System.out.println("입력을 선택했습니다"); break;
			case 2: System.out.println("출력을 선택했습니다"); break;
			default : System.err.println("메뉴를 잘못 선택했습니다");
			}
		} while(menu != 0) ;	// 반복 수행 후 조건을 판별하여 참이면 다시 실행하라
		
		sc.close();
		
	}
}
