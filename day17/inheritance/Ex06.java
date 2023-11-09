package inheritance;

class Human{
	// 이름을 저장할 필드를 작성하세요
	String name;
	// 생성자를 이용하여 이름을 전달받고 필드에 저장하세요
	public Human(String name) {
		this.name = name;
	}
	// 본인의 이름을 출력하는 메서드 show()를 작성하세요
	void show() {
		System.out.println("이름 : "+ name);
	}
}

class Student extends Human{
	// 학생의 성적 점수를 저장할 int형 필드 score를 작성하세요
	int score;
	// 생성자에서 이름과 점수를 전달받고, 이름은 슈퍼클래스의 생성자로 보내고, 점수는 필드에 저장하세요
	public Student(String name,int score) {
		super(name);
		this.score=score;
	}
	
	// show()를 오버라이딩하여, 이름과 점수를 함께 출력하도록 수정하세요
	@Override
	void show() {
		System.out.printf("%s : %d점\n",name,score);
	}
}


public class Ex06 {
	public static void main(String[] args) {
		Human ob1 = new Human("이지은");
		Student ob2 = new Student("홍진호", 22);
		ob1.show();
		ob2.show();
		// 상속을 사용하는 경우
		// A클래스와 B클래스가 is 관계가 성립하면 상속을 사용한다
		// 카테고리(범주)상의 포함관계일 경우에 사용한다
		// Student is a Human
		// class Student extends Human (o)
		
		// 물리적 포함관계는 상속으로 표현하지 않는다 (has)
		// Car has a tire
		// class Tire extends Car (x)
		
		// 같은 상황에서 서로 다른 클래스의 객체를 사용할 수 있는지 확인해보면 된다
		// 학생에게 말을 걸었다 -> 사람에게 말을 걸었다 (o)
		// 자동차를 운전한다 -> 타이어를 운전한다 (x)
		
		// 일반 DB접속 클래스를 이용하여 DB에 접속한다 -> 오라클DB접속 클래스를 이용하여 DB에 접속한다
		
		// 객체 지향의 특성 4가지
		
		// 1. 캡슐화
		// 2. 상속
		// 3. 다형성
		// 4. 추상화
		
	}
}
