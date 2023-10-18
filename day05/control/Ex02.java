package control;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 여러 케이스에 대응되는 하나의 수식을 만들기
		
		Scanner sc = new Scanner(System.in);
		int num;
		String gender = null;
		
		System.out.print("주민들록번호 7번쨰 자리 입력 : ");
		num = sc.nextInt();
		
		switch(num) {
		case 9: case 1:  case 3:
			System.out.println("남성입니다");
			gender = "남성";
			break;
			
		case 0:
		case 2:
		case 4:
			System.out.println("여성입니다");
			gender = "여성";
		}
		
		
		
		System.out.println("gender : " + gender);
		sc.close();
	}
}
