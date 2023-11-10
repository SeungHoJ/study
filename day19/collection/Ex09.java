package collection;

public class Ex09 {
	public static void main(String[] args) throws Exception{
		// 프로세스, 런타임
		
		// Runtime클래스의 객체는 생성자를 통해서 만들 수 없도록 막혀있다
		// ㅐㅇ성자의 접근제한자가 private이다
		// static 메서드 getRuntime()을 이용해서 하나의 런타임만 참조할 수 있도록 되어있다
		// 특정 클래스의 객체가 오직 하나만 생성되고, 하나의 객체만 참조할 수 있는 패턴을 싱글톤 패턴이라고 한다
		Runtime rt = Runtime.getRuntime();
		
		// 런타임 객체를 이용하여 exec() 함수를 호출하면서 문자열로 명령어를 전달하면 실행된다
		
		
		// 컴퓨터에서 실행중인 프로그램 -> 프로세스(Process)
		Process pro = rt.exec("notepad");
		Thread.sleep(3000);
		
		pro.destroy();
		
		// 명령어로 프로그램을 실행할때, 실행파일 이름 다음에 띄어쓰기로 파일을 지정하면
		// 해당 파일을 열기위해서 프로그램을 실행한다
		
		Process pro2 = rt.exec("notepad C:\\windows\\system32\\drivers\\etc\\hosts");
		Thread.sleep(5000);
		pro2.destroy();
		
		String command = "shutdown /a";
		rt.exec(command);
		
		
	}
}
