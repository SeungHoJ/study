package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int answer = ran.nextInt(100)+1;
		int user = 0;
		int count = 0;		//횟수 
		
		// 반복을 수행하면서
		// 사용자에게 값을 입력 받고
		// 만약 정답이 입력밧보다 작으면 down
		// 정답이 입력밧보다 크면 up
		// 일치하면 반복을 중단
		// 반복할때마다 횟수를 증가시키기
		
		// 반복이 끝나면 정답과 횟수를 출력하고 종료
		
		while(true) {
			System.out.print("정답을 입력 : ");
			user = sc.nextInt();
			
			if(answer > user) System.out.println("UP");
			else if(answer < user)System.out.println("DOWN");
			else				break;
			
			
			count++;
			
			
		}
		System.out.printf("%d : 정답입니다.(%d번만에 정답)",answer,count);
		
		sc.close();
	}
}
