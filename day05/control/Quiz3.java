package control;

import java.util.Scanner;

// 이클립스 디버깅하기
// 1) 중단점을 설정한다 (ctrl + shift + b) or 줄번호 왼쪽 클릭
// 2) F11을 눌러서 디버깅을 시작한다
// 3) 

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int num1;
		int num2;
		int year, month, date;
		String gender = null;
		
		System.out.print("주민등록번호 13자리 입력 (xxxxxx-yyyyyyy) : ");
		input = sc.next();
		
		num1 = Integer.parseInt(input.split("-")[0]);
		num2 = Integer.parseInt(input.split("-")[1]);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// 4자리의 출생연도, 2자리의 출생월, 2자리의 출생일
		// 그리고 성별은 문자열로 준비하여 모두 출력하세요
		year = num1 / 10000 ;
		month = num1 / 100 % 100;
		date = num1 % 100;
		
		switch(num2 / 1000000) {
		case 9 : year += 1800; gender = "남성";	break;
		case 0 : year += 1800; gender = "여성";	break;
		case 1 : year += 1900; gender = "남성";	break;
		case 2 : year += 1900; gender = "여성";	break;
		case 3 : year += 2000; gender = "남성";	break;
		case 4 : year += 2000; gender = "여성";	break;
		default : System.out.println("잘못된 주민등록번호입니다.");
		}
		if(gender != null) {
			System.out.printf("%4d-%02d-%02d 성별은 %s입니다",year,month,date,gender);
		}
			
	
		
		
		
		
		sc.close();
	}
}
