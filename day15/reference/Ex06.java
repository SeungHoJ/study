package reference;

// 객체의 참조

class Test6{
	private int num;
	
	public Test6(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	
	
	public void setNum(int num) {
		this.num = num;
	}

}

public class Ex06 {
	static void swapInt(int n1,int n2) {
		int tmp = n1;
		n1 = n2;
		n2 = tmp;
	}
	
	static void swapObject(Test6 n3, Test6 n4) {
		int tmp = n3.getNum();
		n3.setNum(n4.getNum());
		n4.setNum(tmp);
	}
	public static void main(String[] args) {
		int n1 	= 10, n2 = 20;
		System.out.printf("n1 : %d, n2 : %d\n",n1,n2);
		swapInt(n1,n2);
		System.out.printf("n1 : %d, n2 : %d\n",n1,n2);
		System.out.println();
		
		Test6 n3 = new Test6(30);
		Test6 n4 = new Test6(40);
		
		System.out.printf("n3 : %d, n4 : %d\n",n3.getNum(),n4.getNum());
		swapObject(n3,n4);
		System.out.printf("n3 : %d, n4 : %d\n",n3.getNum(),n4.getNum());
		System.out.println();
	}
}
