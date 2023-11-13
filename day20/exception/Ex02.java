package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// java.lang.Exception : 모든 예외 클래스의 최상위 클래스
		Scanner sc = new Scanner(System.in);
		int num;
		
		try{
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			System.out.println("num : " + num);
		
		}catch(InputMismatchException e){	
			System.out.println("정수를 입력해야 합니다");
//			System.out.println(e.toString());  // 예외 형태만 확인하고 싶을 때
//			e.printStackTrace(); 		// 전체 예외 호출 스택을 확인하고 싶을때 (기본형식)
			num = -1;
		}
		finally {
			sc.close();
			System.out.println("프로그램 종료");
	}
		
	
	
	}
}
