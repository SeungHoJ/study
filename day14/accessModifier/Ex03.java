package accessModifier;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Human[] arr = new Human[5];
		Scanner sc = new Scanner(System.in);
		
		// 5번 입력 받아서 객체 생성하고 배열에 넣기
		for(int i = 0;i < arr.length;i++) {
			arr[i] = new Human();
			
			// 이름과 나이를 변수에 입력받고, 입력받은 값을 setter를 활용하여 객체에 넣는다
			System.out.print("이름 입력 : ");
			String name = sc.next();
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			arr[i].setName(name);
			arr[i].setAge(age);
		}
		System.out.println("=======입력 완료=======");
		System.out.println("=======출력 시작=======");
		
		for(int i = 0;i <arr.length;i++) {
			if(arr[i] != null)		// i번째 칸이 빈칸이 아니면
									// arr에는 Human타입의 데이터만 들어갈 수 있으므로
									// 빈칸이 아니면, Human 타입의 객체가 있다는 이야기다
			System.out.printf("%s : %d살\n",arr[i].getName(),arr[i].getAge());
		}
		System.out.println("=======출력 완료=======");
		
		
		
		
		
		
		sc.close();
	}
}
