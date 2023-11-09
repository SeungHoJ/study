package polymorphism;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Human{
	String name;
	
	public Human(String name) {
		this.name=name;
	}
	void info() {
		System.out.println("이름 : "+ name);
		// 서브 클래스에서는 이 메서드를 오버라이딩해서 이름과 직업을 출력해야 합니다
	}
}

class Doctor extends Human{
	public Doctor(String name) {
		super(name);
	}
	@Override
	void info() {
		System.out.printf("이름 : %s, 직업 : %s\n",name,"의사");
	}
	void cure(Human patient) {
		System.out.printf("%s이 %s에게 응급처치를 시행합니다\n",name,patient.name);
	}
}

class Singer extends Human{
	public Singer(String name) {
		super(name);
	}
	@Override
	void info() {
		System.out.printf("이름 : %s, 직업 : %s\n",name,"가수");
	}
}

class Actor extends Human{
	public Actor(String name) {
		 super(name);
	}
	@Override
	void info() {
		System.out.printf("이름 : %s, 직업 : %s\n",name,"배우");
	}
}

class Airplane{
	private Human[] seat = new Human[4];
	
	public boolean entrance(Human guest) {		// 손님이 입장을 시도하면
		boolean result = false;					// 결과반환 변수 (기본값 false)
		for(int i = 0;i < seat.length;i++) {	// 준비된 좌석(배열)중에
			if(seat[i] == null) {				// 빈 칸을 찾아서
				seat[i] = guest;				// 빈 칸에 손님을 앉히고
				result = true;					// 결과를 true로 바꾼다음
				break;							// 반복을 중단한다
			}									// 만약 빈칸이 없다면 결과는 false가 된다
		}
		return result;
	}
	
	public void simulationEmergency(int index) {
		boolean isDoctor = false;
		Doctor tmp = null;
		System.out.println(seat[index].name+" 손님의 배가 아픕니다");
//		System.out.println("의사를 먼저 찾아야 합니다");
//		System.out.println("의사를 찾아서 cure메서드를 호출하세요");
//		System.out.println("인자로 환자를 전달하면 됩니다");
		System.out.println();
		for(int i = 0;i < seat.length;i++) {
			if(seat[i] != seat[index] && seat[i] instanceof Doctor) {
				tmp = (Doctor)seat[i];		// 다운캐스팅, 업캐스팅된 객체를 원래 자료형으로 되돌린다
				tmp.cure(seat[index]);
				isDoctor = true;
			}
			
		
		}
		if(!isDoctor) {
			System.out.println("현재 탑승자중 응급처치 가능한 의사가 없습니다");
	}
}
}
public class Ex02 {
	public static void main(String[] args) {
		Airplane air = new Airplane();
		
		Doctor doctor = new Doctor("이익준");
		Singer guest1 = new Singer("차은우");
		Actor guest2 = new Actor("정우성");
		Human guest3 = new Human("신유진");
		Human guest4 = new Human("왕제은");
		
		Human[] queue = {doctor,guest1,guest2,guest3,guest4};
		List<Human> list = Arrays.asList(queue);
		Collections.shuffle(list);
		list.toArray(queue);
		
		for(int i = 0;i < queue.length;i++) {
//			queue[i].info();
			boolean flag = air.entrance(queue[i]);
			System.out.printf("%s : 탑승%s\n",queue[i].name,flag ? "성공" : "실패");
		}
		
	    air.simulationEmergency(1);
	    
	    // 슈퍼클래스의 배열에 담거나, 슈퍼클래스 타입의 매개변수에 전달하면 업캐스팅이 발생한다
	    // 업캐스팅 상태에서도 오버라이딩 메서드는 바로 호출하여 실행하면 된다
	    // 오버라이딩이 아닌 고유 메서드는 다운캐스팅 후 실행해야한다
	    // 다운캐스팅 하기전에 instanceof를 활용하여 타입을 확인하고 형변환을 수행해야 한다
	}
}
