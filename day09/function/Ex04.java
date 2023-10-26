package function;



class Function{
	int add(int n1, int n2){
		
	
	
	
	int answer = n1 + n2;
	return answer;
	
	}
	
	
}







public class Ex04 {
	public static void main(String[] args) {
		Function f = new Function();
		
		int n1 = 10, n2 = 7;
		int n3 = f.add(n1,n2);
		
		
		System.out.println("n3 : "+n3);
		
		// 한번 함수를 정의해두면 필요할 때 마다 호출하여 사용할 수 있다
		
		int n4 = f.add(1024, 768);
		int n5 = f.add(123213213, -768);
		System.out.println("n4 : " + n4);
		System.out.println("n5 : " + n5);
		System.out.println("f.add(3,5) : " + f.add(3,5));
		
		for(int i = 0; i < 100; i += 20) {
			int p1 = i;
			int p2 = i /20 + 2;
			System.out.println("f.add(p1,p2) : " +f.add(p1,p2) );
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}
}
