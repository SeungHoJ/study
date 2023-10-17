package control;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 지하철 1구간당 평균 소요 시간이 4분이라고 가정한다
		// 이동한 구간수를 입력 받아서 이동하는데 걸리는 시간을 출력하세요
		// 단, 이동한 시간이 60분 이하면 분으로만 출력하고
		// 이동한 시간이 60분을 초과하면 시간과 분으로 나누어서 출력하세요
		
		int distance, hour, min;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이동한 구간 수 : ");
		distance= sc.nextInt();
		
		min = distance * 4;
		
		
		if(min < 60) {
			System.out.printf("소요시간은 %d분 입니다 \n",min);
		}else {
			hour = min / 60;
			min = min % 60;
			System.out.printf("소요시간은 %d시간 %d분입니다 \n",hour,min);
		}
		
		
		sc.close();
	}
}
