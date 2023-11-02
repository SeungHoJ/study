package reference;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		int n1 = 10,n2 = 20;
		boolean flag1 = n1 -n2 > 0;
		
		String s1 = "Hello", s2 = "World";
		boolean flag2 = s1.compareTo(s2) > 0;
		
		System.out.println("n1이 n2보다 크다 : " + flag1);
		System.out.println("s1이 s2보다 크다 : " + flag1);
		
		System.out.println("n1이 n2보다 크다 : " + !flag2);
		System.out.println("n1이 n2보다 크다 : " + !flag2);
		
		// String클래스의 comareTo(String anotherString)은
		// 두개의 문자열 글자의 코드값을 비교하여 정수로 반환한다
		
		Integer[] arr = {50,30,20,40,10};
		String[] arr2 = {"원빈","현빈","우빈","준빈","다빈"};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		sortIntArray(arr);
		sortStringArray(arr2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr, (a, b) -> a - b);
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	static void sortIntArray(Integer[] arr) {
		for(int i = 0; i < arr.length;i++) {
			for(int j = i+1;j < arr.length;j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	static void sortStringArray(String[] arr) {
		for(int i = 0; i < arr.length;i++) {
			for(int j = i+1;j < arr.length;j++) {
				if(arr[i].compareTo(arr[j]) > 0) {
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
}
