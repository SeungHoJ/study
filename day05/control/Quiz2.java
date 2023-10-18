package control;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// 놀이공원에 있는 놀이기구에 대한 이용 요금을 계산해야 한다
		// 이 놀이기구는 탑승하면 기본 3000원의 요금을 받고
		// 이용시간에 따라 추가요금이 발생한다
		// 그 시간과 요금은 아래와 같다
		
		// 시간		요금
		// 0~30		3000
		// 31~40	3500
		// 41~50	4000
		// ...
		
		// 시간을 분으로 입력받아서, 요금을 출력하는 프로그램을 작성하세요
		
		int time, fee = 3000, addTime, totalFee;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간을 입력 하세요(분) : ");
		time = sc.nextInt();
		System.out.println("이용 시간 : " + time);
		
		
		
		
		addTime = (time-30) / 10 + 1;
		if(((time-30) % 10) == 0) addTime -= 1;
		totalFee = addTime * 500 + fee;
		
		if(time <= 30) {
			totalFee = fee;
			System.out.printf("이용 요금은 : %d입니다.",totalFee);
		}else {
			System.out.printf("이용 요금은 : %d입니다.",totalFee);
		}
		
			
		
		sc.close();
	
	}
}
