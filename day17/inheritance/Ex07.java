package inheritance;

class Car{
	int speed;
	int min;
	int max ;
	int perTic = 5;
	
	
	
	public Car() {
		this.min=30;
		this.max=50;
	}
	void drive() {
		System.out.println("출발 !!");
		speed = min;
		while(speed != max) {
			System.out.println("현재속도 : " + speed);
			speed += perTic;
		}
		while(speed >= 0) {
			System.out.println("현재속도 : " + speed);
			speed -= perTic;
		}
		System.out.println("정지 !!\n");
	}
}

class RaceCar extends Car{
	public RaceCar(int min,int max,int perTic) {
		super();
		this.min = min;
		super.max = max;
		super.perTic=perTic;
	}
}
// Car를 상속받는 RaceCar 클래스를작성하세요
// 생성자에서 min, max, perTic을 전달받도록 처리하세요

public class Ex07 {
	public static void main(String[] args) {
		Car ob1= new Car();
		ob1.drive();
		
		RaceCar ob2 = new RaceCar(80,100,10);
		ob2.drive();
		
		
		// 자바의 상속은 단일상속만 가능하다
		// 자바의 서브클래스는 오직 하나의 슈퍼클래스만 가진다
		// 단, 슈퍼클래스가 또다른 슈퍼클래스를 가지면 연이어 상속받는다
		
		// 내가 만든적 없는 메서드가 호출뢴다
		// 슈퍼클래스를 지정하지 않아도, 자동으로 상속되는 클래스가 있다
		// 자바 모든 클래스의 최상위 클래스 : OBject
	}
}
