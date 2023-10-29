package array;

public class Ex03 {
	public static void main(String[] args) {
		
		// 정수형 배열을 참조할 수 있는 참조변수를 생성하고 null로 초기화하세요
		int[] arr= null;
		
//		System.out.println("배열의 길이 : " + arr.length);
	
		// 배열을 리터럴 형식으로 초기화하는것은 배열선언시에만 가능하다
		arr = new int[]{1,2,3,4,5};
		
//		int[] arr2 = new int[] {1,2,3,4,5};
		
		// 배열에는 index가 존재하고, index는 항상 0부터 시작한다
		//
		//		index  [0][1][2][3][4]	
		//		arr = { 1, 2, 3, 4, 5};
		//		
		//			arr[0] = 1
		//			arr[1] = 2
		//			arr[2] = 3
		//			arr[3] = 4
		//			arr[4] = 5
		
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);
		System.out.println("arr[4] : " + arr[4]);
		System.out.println();
		
		for(int i = 0;i < 5;i++) {
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
		System.out.println();
		
		for(int i = 0;i < 5;i++) {
//			System.out.println((i+1)*10);
			arr[i] = (i+1)*10+5;
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
		
		int sum = 0;
		for(int i = 0;i < 5;i++) {
			arr[i] = (i+1)*10+5;
			if(arr[i] % 3 == 0) {
				sum += arr[i];
			}
			
	}System.out.printf("3의 배수 합계 " +sum);
	
	
	
	
}
}
