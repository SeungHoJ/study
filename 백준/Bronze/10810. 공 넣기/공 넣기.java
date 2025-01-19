import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < b; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            for(int j = x-1; j <= y-1; j++){
                arr[j] = z;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
	}	
}