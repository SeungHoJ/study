package day16;

import java.util.Scanner;

public class Exercise6_4 {
	public static void main(String[] args) {
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		int menu;
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		Student[] arr = new Student[] {
			new Student("홍길동",1,1,100,60,76),
			new Student("김길동",1,2,90,70,99),
			new Student("정길동",1,3,80,80,74),
			new Student("박길동",1,4,88,90,60),
			new Student("오길동",1,5,92,90,80),
		};	
		LOOP :while(true) {
			System.out.println("학생 관리 프로그램");
			System.out.println("1) 학생 목록");
			System.out.println("2) 학생 추가");
			System.out.println("3) 이름순 정렬");
			System.out.println("4) 평균순 정렬");
			System.out.print("입력 >>>> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				
				handler.showStudent(arr);
				break;
			case 2 :
				System.out.print("이름 입력: ");
				name = sc.next();
				System.out.print("반 입력 : ");
				ban = sc.nextInt();
				System.out.print("번호 입력 : ");
				no = sc.nextInt();
				System.out.print("국어점수 입력 : ");
				kor = sc.nextInt();
				System.out.print("영어점수 입력 : ");
				eng = sc.nextInt();
				System.out.print("수학점수 입력 : ");
				math = sc.nextInt();
				arr = handler.addStudent(arr, name, ban, no, kor, eng, math);
				break;
			case 3 :
				handler.sortStudentByName(arr);
				handler.showStudent(arr);
				break;
			case 4 :
				handler.sortStudentByAvg(arr);
				handler.showStudent(arr);
				break;
			case 0 :
				sc.close();
				System.out.println("프로그램 종료");
				break LOOP;
			}
		}
		
		
		
		
		
		
	}
}
