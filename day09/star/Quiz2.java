package star;

public class Quiz2 {
	public static void main(String[] args) {
		int size = 5 ;
		
		int st = 1;
		int sp = size - st*2;
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < st; j++) {
				System.out.print("* ");
			}
			for(int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < st; j++) {
				if(j == size / 2 ) {
					System.out.print("");
			}
				else {System.out.print("* ");}
				
			}
			
		
			System.out.println();
			if(i < size /2) {
				sp-=2;
				st+=1;
			}else {
				sp +=2;
				st -=1;
			}
	}
		
		
		
		
		
		
		

}}