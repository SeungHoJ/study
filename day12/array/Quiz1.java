package array;

import java.util.Arrays;

public class Quiz1 {
	public static void main(String[] args) {
		int[] arr = {9,54,23,72,99,85,31,16,49,62};
		
		
		// 1) arr에서 홀수의 개수와 짝수의 개수를 각각 변수에 담아서 출력하세요
		int count1= 0,count2 = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] % 2 ==0) count2++;
			else			   count1++;
		}
		System.out.println("1) 짝수의 개수 : " + count2);
		System.out.println("1) 홀수의 개수 : " + count1);
		
		// 2) arr에서 홀수만 골라서 합계를 구한 다음 출력하세요
		int sum = 0;
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] % 2 != 0 )sum += arr[i];
		}
		System.out.println("2) 홀수의 합계 : " + sum);
		
		
		// 3) arr에서 짝수만 골라서 새로운 배열 arr2에 저장하고 출력하세요
		// [] : 배열 생성시에는 길이를 지정한다 (리터럴 및 변수 사용 가능)
		//		생성된 배열에 대해 사용하면 길이가 아니라, index를 지정한다
		
		// 원본배열의길이는 10이고, 새로운 배열의 길이는 4다
		// 길이가 서로 다르기 때문에, 원본배열의 index와신규배열의 index를 따로 관리해야 한다
		int[] arr2 = new int[count2];
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]%2!=0) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				
			}
		}
		for(int i = 0;i < arr2.length;i++) {
			arr2[i] = arr[i];
		}
		System.out.println("3) "+Arrays.toString(arr2));
		

		// 4) arr의 내용을 거꾸로 담은 배열 arr3를 만들어서 출력하세요
		int[] arr0 = {9,54,23,72,99,85,31,16,49,62};
		int[] arr3 = new int[arr.length];
		int count =0;
		for(int i = arr0.length-1; i >=0;i--) {
			arr3[count]=arr0[i];
			count++;
		}
		
		System.out.println("4) "+Arrays.toString(arr3));
		
		
		// 5) arr를 내림차순 정렬한 후 다시 출력하세요
		for(int i = 0;i < arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {	// 오름차순과내림차순은 크기 비교에 의해서 결정된다
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("5) "+Arrays.toString(arr));
		
		
		
		
		
		
	}
}
