package input;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 친구와 고기집에 갔다
		// 이 식당에서는 첫 주문에 최소 3인분을 주문해야하고
		// 이후에는 1인분씩 추가가 가능하다
		// 돼지고기 삼겹살 1인분이 8500원이고
		// 소주1병(4500원), 맥주1병(5000원)을 고정으로 주문했다
		// 추가 주문한 삼겹살 양을 입력받아서
		// 총 결제해야 할 금액을 계산하고
		// 더치페이로 1인당 얼마를 내야하는지 계산하여 출력하는 프로그램을 작성하세요
		
		int beer = 5000, soju = 4500, meat = 8500;
		int addMeat;
		Scanner sc = new Scanner(System.in);
		System.out.print("추가한 고기인분 : ");
		addMeat = sc.nextInt();
		
		int result =  ((meat*3)+(meat*addMeat)+soju+beer)/2;
		System.out.printf("더치페이할 가격은 %d원입니다.",result);
		
		sc.close();
	}
}
