package loop;

public class Ex01 {
	public static void main(String[] args) {
		// 반복문
		// 특정 조건에 따라, 코드를 반복하여 수행하는 구문
		
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		int num = 0;
		while(num < 50) {
			num++;
			System.out.println("while : " + num);
		}
		System.out.println();
		
		for(int i = 0; i < 5;i++) {
			System.out.println("for : " + i);
		}
		// 새로운 반복을 돌리기 위해 횟수를 0으로 대입
		num = 0;
		if(num < 20) {				// 조건이 참일때 종속문장을 1회 실행한다
			System.out.println("if : " + ++num);
		}
		while(num < 20) {			// 조건이 참인동안 종속문장을 반복하여 실행한다
			System.out.println("while : " + ++num);
		}	// 종속문장을 실행하고 나면, 다시 조건을 체크한다
		
	}
}
