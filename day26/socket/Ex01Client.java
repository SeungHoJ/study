package socket;


import java.net.Socket;
import java.util.Scanner;

public class Ex01Client {
	public static void main(String[] args) throws Exception {
		// 아이피와 포트번호를 지정하여 대상 서버에 접속한다
		
		Socket so = new Socket("127.1.0.0", 1234);
		
		Scanner sc = new Scanner(so.getInputStream());
		
		String content = "";
		while(sc.hasNextLine()) {
			content += sc.nextLine() + "\r\n";
		}
		sc.close();
		so.close();
		
		System.out.println("=================");
		System.out.println(content);
		System.out.println("=================");
		
	}
}
