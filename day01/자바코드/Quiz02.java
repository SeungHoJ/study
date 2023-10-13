package variable;

public class Quiz02 {

	public static void main(String[] args) {
		// 자신의 이름을 문자열 변수에 저장하세요(문자열은 primitive가 없습니다. String)
		String name = "정승호";
		String name1 = name;
		// 자신의 나이를 정수형 변수에 저장하세요
		int age = 27;
		Integer age1 = age;
		// 새로운 실수형 변수에 0을 대입하세요
		double db = 0; // 우변의 0은 자료형이 명시되지 않은 리터럴이지만, 리터럴 정수의 기본자료형은 int이다
		// 방금 만든 실수형 변수에 3.14를 대입하세요
		db = 3.14;
		Double db1 = db;
		// 지금까지 만든 3개 변수에 담긴 값을 각각 한줄씩 화면에 출력하세요
		//(primitive를 이용해서 한번, WrapperClass를 이용해서 한번 코드를 실행하세요)
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("실수 : " + db);
		System.out.println();
		System.out.println("이름 : " + name1);
		System.out.println("나이 : " + age1);
		System.out.println("실수 : " + db1);
	
		

	}

}
