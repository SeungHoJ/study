package abstraction;

abstract class Loop{		// 추상 클래스는 단일 상속만 가능
	abstract void loop();		// 추상 메서드( 상속받는 서브클래스가 구현해야함)
	void info() {
		System.out.println("반복을 수행하는 클래스입니다");
	}
}

class NumberLoop extends Loop implements Runnable{	// 정수를 반복해서 출력하는 클래스 NumberLoop + 다중실행이 가능한 특성이 부여됨

	@Override
	void loop() {
		for(int i = 0; i <= 25;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	@Override
	public void run() {
		loop();
	
}
	
}

class AlphabetLoop extends Thread{
	@Override
	public void run() {
		for(char ch = 'A';ch <= 'Z';ch++) {
			System.out.print(ch+" ");
		}
		System.out.println();
	}
	
}

public class Ex08 {
	public static void main(String[] args) {
		NumberLoop ob1 = new NumberLoop();
		AlphabetLoop ob2 = new AlphabetLoop();
		
//		ob1.loop();
//		ob2.run();
		
//		ob2.start();	// 
//		ob1.loop();		// ob1에서도 다중실행이 가능한 특성을 추가로 부여하고 싶다
						// Thread 클래스를 상속받으면 된다
						// NumberLoop는 이미 Loop라는 슈퍼클래스가 있다
						// 자바에서는 클래스의 다중상속을 허용하지 않는다
		
		Thread th = new Thread(ob1);
		th.start();
		ob2.start();
		
		// 1) 서로 다른 클래스를 하나의 자료형으로 묶을 수 있다
		// 2) 클래스작성 시 추가적인 특성을 자유롭게 부여할 수 있다
		
//		자주 사용하는 인터페이스 중에는 이름이 able로 끝나는 경우가 많다
//		Runnable : 다중실행이 가능한
//  	Serializable : 데이터를 직렬화할수 있는(직렬화하면 파일 저장 및 네트워크 전송이 가능해진다	
//		Comparable : 배열 및 리스트 정렬 시 기준을 제시하지 않아도 기본값을 정렬을 수행할 수 있다
		
//		List, Set, Map <- 인터페이스
//		이 경우는 특성 부여보다, 서로 다른 여러 유형의 클래스를 같은 형식으로 묶기 위한 성격이 크다
// 		List를 구현하는 클래스 : ArrayList,LinkedList, Stack, Queue, Vector...
		
		
	}
}
