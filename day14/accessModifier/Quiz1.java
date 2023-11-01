package accessModifier;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
	
	// Human 클래스를 이용하여 비어있는 상태의 객체를 하나생성하세요
	
	Scanner sc = new Scanner(System.in);
	Human ob = new Human();
	
	// 본인의 이름과 나이를 키보드로 입력하여 그 값을 ob에 저장하고
	// 한줄에 출력하세요
	System.out.print("이름을 입력 : ");
	String name = sc.nextLine();
	
	System.out.print("나이를 입력 : ");
	int age = sc.nextInt();
	

	ob.setName(name);
	ob.setAge(age);
	
	System.out.printf("\n이름 : %s\n나이 : %d",ob.getName(),ob.getAge());
	
	sc.close();
	
	}
}
