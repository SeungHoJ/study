package function;

public class Ex02 {
	static int add(int n1, int n2) {
		int answer = 0;
		answer = n1 + n2;
		return answer;
	}
	
	static int getMinNumber(int n1, int n2, int n3) {
		int answer = 0;
		if(n1>n2)n1=n2;
		if(n1>n3)n1=n3;
		answer=n1;
		
		return answer;
	}
	
	static String upperCase(String s1) {
		String answer = "";
		for(int i =0;i < s1.length();i++) {
			char ch = s1.charAt(i);
			if(i==0 && 'a'<=ch&&ch<='z') {
				ch -=32;
			}
			answer +=ch;
		}
		
		return answer;
	}
	
	static String substring(String s1,int n1, int n2) {
		String answer = "";
		
		for(int i = 0;i <s1.length();i++) {
			char ch = s1.charAt(i);
			if(n1 <=i && i<n2)answer+=ch;
			
		}
		
		
		
		return answer;
	}
	public static void main(String[] args) {
		// 1) 두 정수의 덧셈을반환하는 함수 add를 작성하세요
		int result1 = add(3,4);
		System.out.println("result1 : " + result1);
		
		//2) 세 정수를 전달받아서 가장 작은 수를 반환하는 함수 getMinNumber를 작성하세요
		int result2 = getMinNumber(1,2,3);
		System.out.println("result2 : " + result2);
		
		// 3) 문자열 하나를 전달받아서, 첫글자를 대문자로 변환하는 함수 upperCase를작성하세요
		String q3 = upperCase("hello");
		System.out.println("q3 : " + q3);
		
		// 4) 문자열 하나와 정수 두개를 전달받아서
		// 문자열의 from번째 글자부터 to글자 이전까지의 글자를 잘라낸
		// 새로운 문자열을 반환하는 함수 substring을 작성하세요
		String q4 = substring("Hello, world !!",0,5);
		System.out.println("q4 : " + q4);
		
		String t4 = substring("Hello, world !!",7,12);
		System.out.println("t4 : " + t4);
	}
}
