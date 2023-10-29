package array;

import java.util.Arrays;
import java.util.Random;

public class Ex08 {
	static void selectionSort(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {	// 오름차순과내림차순은 크기 비교에 의해서 결정된다
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}		
	}}
	}
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[1000000];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(arr.length);
		}
		System.out.println(Arrays.toString(arr));
		
		long start = System.currentTimeMillis();
		selectionSort(arr);
		long end = System.currentTimeMillis();
		
		System.out.println(Arrays.toString(arr));
		System.out.println((end-start)/1000.0);
		
		
	}
}
