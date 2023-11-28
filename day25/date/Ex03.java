package date;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Ex03 {
	public static void main(String[] args) throws Exception{
		// Date 클래스의 setTime(long time)을 사용하면 날짜객체의 시간을 조절할 수 있다
		// Date 클래스의 getTime()을 사용하면 날짜 객체의 시간 정수를 long으로 반환받는다
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");	// 날짜 생성용
		
		Date d1 = sdf.parse("2023-11-01"); 
		Date d2 = sdf.parse("2023-11-30");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");	// 날짜 출력용
		
		for(long ln = d1.getTime(); ln <=d2.getTime(); ln += (1000*60*60*24)) {
			Date d = new Date(ln);
			String s = sdf2.format(d);
			if(s.contains("토요일") || s.contains("일요일")) {
				System.out.println(s);
				
			}
			
		}
		
		
//		d1.getHours();		// Deprecated, 이전에 사용되었으나 지금은 사용을 권장하지 않는 함수
//		d1.getMinutes();	// 만료되었음
//		d1.getSeconds();	// 다만 이전 버전 프로그램과의 호환성을 위해서 남겨두기는 함
		
		long ln = d1.getTime();
		System.out.println(ln);
		
		
		
		
		
	}
}
