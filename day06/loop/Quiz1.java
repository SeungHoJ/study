package loop;

public class Quiz1 {
	public static void main(String[] args) {
		int num, sum;
		// 1) 자신의 이름을 5회 반복하여 출력하세요
		num = 0;
		while(num < 5) {
			System.out.print("정승호"+" ");
			num++;
		}
		System.out.println();
		// 2) 0부터 5까지 출력하세요
		num = 0;
		while(num < 6) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
	
		// 3) 5부터 0까지 출력하세요
		num = 5;
		while(num >= 0 ) {
			System.out.print(num+" ");
			num--;
		}
		System.out.println();
	
		// 4) 1부터 100까지의 합계를 구하여 출력하세요
		num = 0; sum = 0;
		while(num < 101) {
			sum += num;
			num++;
		}
		System.out.println(sum);

		
		// 5) 1부터 100사이의 정수중, 7의 배수만 한줄에 출력하세요
		num = 1;
		while(num < 101) {
			if(num % 7 == 0) {
				System.out.print(num+" ");
			}
			num++;
		}
		System.out.println();
	}
}
