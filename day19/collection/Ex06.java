package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex06 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size() != 6) {
			int num = ran.nextInt(45)+1;
			set.add(num);
		}
		ArrayList<Integer> list = new ArrayList<>(set);
		list.sort(null);
		System.out.println("list : " + list);
	}
	
	
}
