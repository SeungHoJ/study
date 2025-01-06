import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = a-1;
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                if(j >= num){
                    System.out.print("*");
                   
                }else{
                    System.out.print(" ");
                }
                
            }
            num--;
            System.out.println();
        }
	}	
}