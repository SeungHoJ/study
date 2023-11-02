package reference;

public class Ex08 {
	public static void main(String[] args) {
		// compareTo 함수를 직접 구현해보기
		
		String s1 = "apple";
		String s2 = "banana";
		String s3 = "aegis";
		
		System.out.println("s1.compareTo(s2) : " + s1.compareTo(s2));
		System.out.println("s2.compareTo(s3) : " + s2.compareTo(s3));
		System.out.println("s1.compareTo(s3) : " + s1.compareTo(s3));
		System.out.println();
		
		System.out.println("myCompareTo(s1,s2) : " + myCompareTo(s1,s2));
		System.out.println("myCompareTo(s2,s3) : " + myCompareTo(s2,s3));
		System.out.println("myCompareTo(s1,s3) : " + myCompareTo(s1,s3));
		System.out.println();
	}
	
	
	static int myCompareTo(String s1, String s2) {
		int answer = 0;
		
		int size = s1.length() > s2.length() ? s2.length() : s1.length();
		for(int i = 0;i < size;i++) {
			char a = s1.charAt(i);
			char b = s2.charAt(i);
			if(a != b) {
				answer = a - b;
				break;
			}
		}
		if(answer == 0 && s1.length() != s2.length()) {
			answer = s1.length() - s2.length();
		
		
		}
		return answer;
	}
}
