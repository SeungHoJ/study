import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] arr = time.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        
        b -= 45;
        if(b < 0){
            b = 60 + b;
            a -= 1;
            if(a < 0){
                a = 24 + a;
            }
        }
        time = a + " "+ b;
        System.out.print(time);
	}	
}