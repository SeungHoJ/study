package day16;

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student() {
		
	}
	public Student(String name,int ban,int no, int kor,int eng,int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		int sum;
		sum = kor+eng+math;
		return sum;
	}
	public float getAverage() {
		float avg;
		double test = Math.round(getTotal()/3.0*10)/10.;
		avg = (float)test;
		return avg;
	}
	
	
	
	public String info() {
		String str = "";
		int sum = kor+eng+math;
		double avg = sum/3.0;
		String avg1 = String.format("%.1f", avg);
		float favg = Float.parseFloat(avg1);
		str = (name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+favg);
		
		return str;
	}
	
	
	
	
	
}

public class Exercise6_2{
	public static void main(String[] args) {
		
		
		Student s = new Student("홍길동",1,1,100,60,76);
		String str = s.info();
		System.out.println(str);
		
		
		
	}
}
