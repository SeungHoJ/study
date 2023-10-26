package function;

public class Ex03 {
	
	static int getMaxNum(int n1, int n2) {
		int num = 0;
		if(n1< n2)n1 = n2;
		num = n1;
		
		
		return num;
	}
	static int getMaxNum(int n1, int n2, int n3) {
		int num = 0;
		if(n1 < n2)n1 = n2;
		if(n1 < n3)n1 = n3;
		num = n1;
		
		
		return num;
	}
	// n개의 정수중에서 가장큰 값을 반환하기
	static int getMaxNum(int...arr) {
		int result = 0;
//		for(int i = 0;i < arr.length;i++) {
//			int num = arr[i];
//			if(result < num)result = num;}
		for(int num : arr) {
			if(result < num) result = num;
		}
		
		return result;
	}
	public static void main(String[] args) {
		int num1 = getMaxNum(10,20);
		int num2 = getMaxNum(10,20,30);
		int num3 = getMaxNum(1,2,3,4,123,123,123,12,312);
		
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
		System.out.println("num3 : "+ num3);
		
		
	}
	
	
	
	
	
	
	
}
