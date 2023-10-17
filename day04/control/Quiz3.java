package control;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 서로 다른 세 정수를 입력받은 다음 가장 큰수를 하나 출력하세요
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, max;
		
		System.out.print("첫번째 정수를 입력 : ");
		n1 = sc.nextInt();
		System.out.print("두번째 정수를 입력 : ");
		n2 = sc.nextInt();
		System.out.print("세번째 정수를 입력 : ");
		n3 = sc.nextInt();
		
		if(true)	max = n1;
		if(max < n2)max = n2;
		if(max < n3)max = n3;
		
		System.out.println("가장 큰 수는 "+ max);
		
		sc.close();
	}
}
