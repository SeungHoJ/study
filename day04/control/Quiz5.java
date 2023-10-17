package control;

import java.util.Random;
import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int eleA, eleB, eleC, myEle, Adistance, Bdistance, Cdistance;
		
		eleA = ran.nextInt(15) + 1;
		eleB = ran.nextInt(15) + 1;
		eleC = ran.nextInt(15) + 1;
		
		System.out.print("현재 층수를 입력 : ");
		myEle = sc.nextInt();
		
		Adistance = myEle - eleA;
		Bdistance = myEle - eleB;
		Cdistance = myEle - eleC;
		
		System.out.printf("%d, %d, %d\n",eleA, eleB, eleC);
		
		// 현재 자신의 위치를 1 ~ 15 사이로 입력한 다음
		// 가장 가까운 엘리베이터가 몇번째인지 출력하는 코드를 작성하세요
		// (가장 가깝다 = 거리값이 최소이다 = 차이의 절대값이 최소값이다)
		if(Adistance < 0) Adistance = -Adistance; 
		if(Bdistance < 0) Bdistance = -Bdistance; 
		if(Cdistance < 0) Cdistance = -Cdistance;
		
		
	if(Adistance < Bdistance && Adistance < Cdistance) {
			System.out.println("A엘리베이터가 호출됩니다.");
		
		}else if(Bdistance < Cdistance) {
			System.out.println("B엘리베이터가 호출됩니다.");
		}else {
			System.out.println("C엘리베이터가 호출됩니다.");
		}
		
		sc.close();
}
}
