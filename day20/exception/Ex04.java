package exception;

import java.util.Scanner;

public class Ex04 {
	static int getDivide(int n1, int n2) throws ArithmeticException{	// callee : 호출 당하는 함수
		return n1 / n2;						// employee
	}
	public static void main(String[] args) throws Exception{	// caller : 다른 함수를 호출하는 함수
		// 예외 전가 (throws)						// employer
		// callee에서 발생한 예외를 caller에게 전가시킨다
		
		int n1, n2, answer;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 2개입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		answer = getDivide(n1, n2);
		System.out.printf("%d / %d = %d\n",n1,n2,answer);
	try {
	}catch(ArithmeticException e) {
			System.out.println("숫자를 0으로 나눌 수 없습니다 !!");
		}
		sc.close();
		System.out.println("프로그램 종료");
		
		
	}
}
