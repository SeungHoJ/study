package loop;

import java.io.File;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) throws Exception{
		String data = "";
		File f = new File("C:\\windows\\system32\\drivers\\etc\\hosts");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()) {
			data += sc.nextLine() + "\n";
		}
		sc.close();
		
		System.out.println(data);
		int count = 0;
		for(int i =0; i < data.length();i++) {
			char ch = data.charAt(i);
			if('A' <= ch && ch <= 'Z')count++;
		}
		System.out.println("대문자의 갯수 : " + count);
		
		
		// 위와비슷한 구조의 숫자 문제
		// 1에서 1000사이의 정수중에서 13 과 17의 공배수는 총 몇개인지 출력하세요
		
		count = 0;
		for(int i = 1; i< 1001;i++) {
			if(i % 13 == 0 && i % 17 == 0)count++;
		}
		System.out.println("13과 17의 공배수 개수 : " + count);
		
		
		
		
		
		
		
	}
}
