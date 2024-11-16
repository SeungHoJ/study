import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        int min = sc.nextInt();
        
        int hh = 0;
        int mm = 0;
        String[] times = time.split(" ");
        int t = Integer.parseInt(times[1])+min;
        if(t >= 60){
            hh = t/60;
            hh += Integer.parseInt(times[0]);
            if(hh >= 24){
                hh -= 24;
            }
            mm = t % 60;
        }else{
            hh = Integer.parseInt(times[0]);
            mm = Integer.parseInt(times[1])+min;
        }
        System.out.print(hh + " "+mm);
	}	
}