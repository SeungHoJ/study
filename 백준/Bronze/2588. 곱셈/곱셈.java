import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        
        System.out.println(a*Integer.parseInt(b.charAt(2)+""));
        System.out.println(a*Integer.parseInt(b.charAt(1)+""));
        System.out.println(a*Integer.parseInt(b.charAt(0)+""));
        System.out.println(a*Integer.parseInt(b));
	}	
}