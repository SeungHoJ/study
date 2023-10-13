package variable;

public class Ex04 {

	public static void main(String[] args) {
		// 기본 자료형 (primitive type)
		// 자바는 객체지향 언어이므로, 모든 값은 객체 형태로 나타내야 한다
		// 이떄 객체란, 데이터와 함수가 결합되어 있는 형태를 말한다
		// 그러나 기본 자료형은 함수 없이 순수 데이터만으로 구성되어 있다
		// 그래서 원시 자료형이라는 이름을 사용한다
		
		String name = "이지은";
		int age = 31;
		byte by = 127;
		boolean bo = true; // 영어나 한글의 마침표(.)에 해당하는 기호
		
		short sh = 32767;
		char ch = 44032;
		long ln = 3000000000L;	// 기본 자료형이 아니기 때문에 long임을 명시한다
		float fl = 1.2f;		// 기본 자료형이 아니기 때문에 float임을 명시한다
		double db = 3.14;

		System.out.println(name);
		System.out.println(age);
		System.out.println(by);
		System.out.println(bo);
		System.out.println(sh);
		System.out.println(ch);
		System.out.println(ln);
		System.out.println(fl);
		System.out.println(db);
		
		// 대입 : 오른쪽의 값을 왼쪽 변수 공간에 복사하여 저장한다
		// 왼쪽과 오른쪽의 값은 같지 않아도 되지만, 자료형은 같아야한다.
		//int num = "점심식사";
		
		// age = "배고파";
		// 이미 선언된 변수는 자료형이 나타나지 않지만, 툴팁이나 링크 따라가기등으로
		// 확인이 가능하다
		
		// 양쪽다 변수를 나타내고 있지만
		// 오른쪽의 변수는 변수에 담긴 값을 의미하고
		// 왼쪽의 변수는 변수공간 그 자체를 의미한다
		
		// 왼쪽과 오른쪽의 자료형이 맞지 않아서 대입이 안되니, 자료형을 강제로 맞추면
		// 대입이된다. 단, 이때 값의 보존 여부는 보장할 수 없다
		sh = (short)ch;
		System.out.println("sh : " + sh);
	}

}
