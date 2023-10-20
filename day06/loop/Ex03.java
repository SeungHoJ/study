package loop;

public class Ex03 {
	public static void main(String[] args) {
		int num = 0;
		
		while(num < 5) {				// 조건이 참인 동안 종속문장을 실행한다
			System.out.println(num);
			num++;
		}
		System.out.println();
		
		num = 0;
		while(true) {					// 조건은 항상 참이다. 무조건 반복문을 수행한다
			System.out.println(num);
			num++;
			if(num >= 5) {				// if의 조건이 참이면 break한다. 반복문을 중단하는 조건이다
				break;
			}
		}
		System.out.println();
		
		num = 0;
		while(true) {					// 조건은 항상 참이다. 무조건 반복문을 수행한다
			System.out.println(num);
			num++;
			if(num < 0) {				// if의 조건이 참이면 break한다. 반복문을 중단하는 조건이다
				break;
			}
}
		}
	}
