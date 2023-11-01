package accessModifier;

import java.util.Scanner;


// 이 프로그램에서 다룰 단일 데이터의 형태 : class Human

// 이 프로그램의 내부 기능을 담당하는 형태
class Handler5{
	// 프로그램에서 사용되는 상세 기능을 함수로 구현하면 됩니다
	// 필요한 변수가 있다면 필드로 생성해도 됩니다
	
	// 객체 형태의 데이터를 저장하기 위한 자료구조
	private Human[] arr = new Human[5];
	
	// 이름과 나이를 전달받아서, Human형태의 객체를 생성하고, 배열에 추가하는 함수
	// 추가되면1, 아니면 0을 반환한다
	public int add(String name,int age) {
		int row = 0;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == null) {
				arr[i] = new Human();
				
				arr[i].setName(name);
				arr[i].setAge(age);
				row = 1;
				break;
			}
		}
		return row;
	}
	
	public void showList() {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] != null)		
									
			System.out.printf("%s : %d살\n",arr[i].getName(),arr[i].getAge());
	}
	}
	
	
	
	
	
}

public class Ex05 {
	public static void main(String[] args) {
		// Human 타입의 객체를 저장할 수 있는 배열을 준비
				// while,switch ~ case를 이용하여 메뉴를 선택하는 형식
				// 메뉴 선택에 따라 입력 및 출력을 수행하는 프로그램
				
				Scanner sc = new Scanner(System.in);
				Handler5 handler = new Handler5();
				int menu;
				String name;
				int age;
				int row;
				
				while(true) {
					System.out.println("1. 입력");
					System.out.println("2. 출력");
					System.out.println("0. 종료");
					System.out.println("선택 >>>>>>");
					menu = Integer.parseInt(sc.nextLine());
					switch(menu) {
						case 1:
							System.out.print("이름 입력 : ");
							name = sc.nextLine();
							System.out.print("나이 입력 : ");
							age = Integer.parseInt(sc.nextLine());
							row = handler.add(name, age);
							
							System.out.println(row != 0 ? "추가 성공" : "추가 실패");
							break;
						case 2:
							handler.showList();
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
