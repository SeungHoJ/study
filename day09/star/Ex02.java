package star;

public class Ex02 {
	public static void main(String[] args) {
		// 홋수를 제어할 변수를 미리 만들어두고 내가 직접 횟수를 변경/제어하기
		
		
		int size = 5;
		int sp = 2;
		int st = 1;
		
		for(int i = 0; i <size;i++) {
			
			for(int j = 0; j < sp; j++) {// 공백
				System.out.print("_ ");
			}
			for(int j = 0; j < st; j++) {// 별
				System.out.print("# ");
			}
			for(int j = 0; j < sp; j++) {// 공백
				System.out.print("_ ");
			}
			System.out.println();
			if(i < size / 2) {		// 전체줄 중에서 가운데도달하지 못했다면
				sp -=1;
				st +=2;
			}else {	// 가운데 줄이거나아랫쪽이면
				sp +=1;
				st -= 2;
			}
			
			
		}
		
		
		
		
		
		
		
		
	}
}
