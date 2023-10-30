package exam;


import java.util.Random;

public class Exam2 {
	static void arraySort(int[] arr) {		
		for(int i = 0;i < arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {	
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}		
	}}
		
	}
	static boolean isDup(int[] arr) {
		
		boolean result = false;
		for(int i = 0;i < arr.length;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					result = true;
					break;
				}
			}
			if(result == true)break;
		}
		
		
		
		return result;
	}
	static int[] getArray2() {														
		Random ran = new Random();
		int[] arr = new int[6];
		for(int i = 0; i < 6;i++) {
			arr[i] = ran.nextInt(45)+1;
		}
		while(true) {
			if(isDup(arr)) {
				for(int i = 0; i < 6;i++) {
					arr[i] = ran.nextInt(45)+1;
				}
				
				
			}else break; 
		}
		
	
		
		return arr;
	}
	// isDup을 이용하여 랜덤배열함수 추출 함수
	static int[] getArray1() {
		Random ran = new Random();
		
		int[] arr = new int[6];
		
		for(int i = 0;i < 6;i++) {
			int num = ran.nextInt(45)+1;
			arr[i] = num;
			for(int j = 0; j < i; j ++) {
				if(arr[j]==arr[i]) {
					i--;
					
				}
			}
		}
		return arr;
	}
	// 랜덤값을 비교하며 추출하는 함수
	public static void main(String[] args) {
		System.out.println("응시자 : 정승호\n");
		for(int i = 0;i <5;i++) {
			int[] arr = getArray1();		// 두 기능중 택 1해서 함수 호출
			arraySort(arr);
			System.out.printf("%2d, %2d, %2d, %2d, %2d, %2d",arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
			System.out.println();
			}
		
				
		
				
			
		
	
	
		
		
		
		
	}
	}

