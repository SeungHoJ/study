package date;

import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		
		// java.sql.Date 의 toString()은 yyyy-mm-dd 형식으로만 출력하게 되어있다
		// java.sql.Date의 생성자는 반드시 long값을 전달해야만 한다 (기본생성자 없음)
		java.sql.Date d1 = new java.sql.Date(0);
		System.out.println("d1 : " + d1);
		
		// java.sql.Date 는 java.util.Date의 서브클래스이다
		java.util.Date d2 = new java.util.Date();
		System.out.println("d2 : " + d2);
		
		java.sql.Date d3 = new java.sql.Date(d2.getTime());
		System.out.println("d3 : " + d3);
		
		// java.text.SimpleDateFormat 을 이용하여 문자열 <-> 날짜 형식을 활용할 수도 있다
		// y : year, 연도
		// m : month
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		java.util.Date d4 = sdf.parse("1993-05-16");
		System.out.println("d4 : " + d4);
		java.sql.Date d5 = new java.sql.Date(d4.getTime());
		System.out.println("d5 : " + d5);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s2 = sdf2.format(d5);
		d4.setTime(d4.getTime()+(1000*60*60*14));
		System.out.println(s2);
		String s3 = sdf2.format(d4);
		System.out.println(s3);
		
		
	}
}
