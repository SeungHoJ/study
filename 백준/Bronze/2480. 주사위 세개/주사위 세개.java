import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        
        String[] num = nums.split(" ");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        int c = Integer.parseInt(num[2]);
        int answer = 0;
        if(a == b && b == c){
            answer = 10000 + 1000 * a;
        }
        else if(a == b && a != c){
            answer = 1000 + 100 * a;
        }else if(a != b && b == c){
            answer = 1000 + 100 * b;
        }else if(a == c && a != b){
            answer = 1000 + 100 * a;
        }else{
            if(a < b)a=b;
            if(a < c)a=c;
            answer = a * 100;
        }
        System.out.print(answer);
	}	
}