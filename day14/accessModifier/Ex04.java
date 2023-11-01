package accessModifier;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// Human 타입의 객체를 저장할 수 있는 배열을 준비
		// while,switch ~ case를 이용하여 메뉴를 선택하는 형식
		// 메뉴 선택에 따라 입력 및 출력을 수행하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		Human[] arr = new Human[5];
		int menu;
		String name;
		int age;
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 종료");
			System.out.println("선택 >>>>>>");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
				case 1:
					for(int i = 0;i < arr.length;i++) {
						if(arr[i] == null) {
							arr[i] = new Human();
							System.out.print("이름 입력 : ");
							name = sc.nextLine();
							System.out.print("나이 입력 : ");
							age = Integer.parseInt(sc.nextLine());
							arr[i].setName(name);
							arr[i].setAge(age);
							break;
						}
						if(arr[arr.length-1] != null) {
							System.out.println("더이상 입력할 칸이없습니다");
							break;
						}
					}
					
					break;
				case 2:
					for(int i = 0;i<arr.length;i++) {
							if(arr[i] != null)		
													
							System.out.printf("%s : %d살\n",arr[i].getName(),arr[i].getAge());
					}
					break;
				
				case 0:
					sc.close();
					System.out.println("프로그램 종료");
					return;
				default:
					System.out.println("잘못 선택하셨습니다");
			
			
			}
			System.out.println();
			
		}
		
		
		
	}
}
