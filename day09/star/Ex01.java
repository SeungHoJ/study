package star;

public class Ex01 {
	public static void main(String[] args) {
		
		
		for(int i = 1; i < 6; i++) {
			int num = 5-i;
			
			for(int j = 0; j < num; j++) {
				System.out.print("  ");
			}
		
			for(int j = 0; j < i; j++) {
				System.out.print("# ");
				
			}
			
			System.out.printf("\t%d, %d", num, i);
			System.out.println();
		}
		
		
		
		
	}
}
