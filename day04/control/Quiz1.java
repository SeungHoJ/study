package control;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 두 정수를 입력 받아서 더 큰수를 화면서 출력하세요
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("정수를 입력하세요(a) : ");
		a = sc.nextInt();
		System.out.print("정수를 입력하세요(b) : ");
		b = sc.nextInt();
		
		
		if(a>b)	{
			System.out.printf("더 큰수는 %d입니다",a);
		}else if(a==b){
			System.out.println("두 수는 같습니다");
		}else {
			System.out.printf("더 큰수는 %d입니다",b);
		}
		
		sc.close();
	}
}
