package input;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		String name;		// 문자열 형식의 이름
		int age;			// 정수 형식의 나이
		
		Scanner sc = new Scanner(System.in);		// 키보드 표준 입력을 위한 Scanner
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = Integer.parseInt(sc.nextLine());
		
		
		if(age >= 20) {
			System.out.printf("%s님은 (%d세) 성인입니다",name,age);
		}else {
			System.out.printf("%s님은 (%d세) 미성년자입니다",name,age);
		}
		
		sc.close();

	}
	// 이름과 나이를 입력 받고
	// 나이를 이용하여 성인 여부를 문자열로 준비한다음
	// 이름, 나이, 성인여부를 한 문장에 출력하는 코드를 작성하세요
	// (단, 성인은 20세 이상입니다)
	
	// 1) 변수 선언 및 초기화
	
	// 2) 입력
	// 입력 받아야 하는 값을 순서대로 입력받는다
	// 자료형에 따라 실행(호출)하는 함수가 서로 다르다
	
	// 3) 연산
	// 빈 값이 있는가? isAdult의 값이 아직 준비되지 않았따
	// age의 값을 이용하여 isAdult의 값을 계산한다
	
	// 4) 출력
	// 모든값이 준비되었다면 서식을 준비하고 값을 출력한다
	
	// 5) 마무리

	
				
	
}
