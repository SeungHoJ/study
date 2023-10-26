package function;

public class Quiz1 {
	
	// 1) getSign
	static String getSign(int num) {
		String s = "";
		s = Integer.toString(num);
		
		return s;
	}
	// 2) getReverseNum
	static int getReverseNum(int num){
		int result = 0;
		
		while(num != 0) {
			result *= 10;
			result += num % 10;
			num /= 10;
		}
		
		return result;
	}
	// 3) pow
	static int pow(int n1, int n2) {
		int du = 1;
		
		for(int i = 0; i < n2; i++) {
			du *= n1;
		}
		
		
		return du;
	}
	// 4) remainder
	static int remainder(int n1,int n2) {
		int result = 0;
		result = n1 % n2;
		
		
		
		return result ;
	}
	// 5) getReverseStr
	static String getReverseStr(String s1) {
		String s = "";
		for(int i = s1.length()-1; i >=0; i-- ) {
			char ch = s1.charAt(i);
			s += ch;
		}
		
		return s;
	}
	
	
	
	
	public static void main(String[] args) {
		// 1) 정수를 하나 전달받아서, 양수, 음수, 0을 문자열로 반환하는 함수 getSign
		String q1 = getSign(10);
		System.out.println(q1);
		// 2) 정수를 하나 전달받아서 정수의 배치를 거꾸로 뒤집어 반환하는 함수 getReverseNum
		int q2 = getReverseNum(1234);
		System.out.println(q2);
		// 3) 두 정수를 전달받아서 n1의 n2제곱수를 반환하는 함수 pow
		int q3 = pow(2, 3);
		System.out.println(q3);
		// 4) 두 정수를 전달받아서 n1을 n2로 나누었을때의 나머지를 반환하는 함수 remainder
		int q4 = remainder(3,3);
		System.out.println(q4);
		// 5) 문자열을 하나 전달받아서, 문자열을 거꾸로 배치한 값을 반환하는 함수 getReverseStr
		String q5 = getReverseStr("hello");
		System.out.println(q5);
}
}
