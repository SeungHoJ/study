package day16;

public class Handler {
	public void sortStudentByAvg(Student[] arr) {
		for(int i = 0;i < arr.length;i++) {
			for(int j= i+1; j < arr.length;j++) {
				if(arr[i].getAverage() < arr[j].getAverage()) {
					Student tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public void sortStudentByName(Student[] arr) {
		for(int i = 0;i < arr.length;i++) {
			for(int j= i+1; j < arr.length;j++) {
				if(arr[i].name.compareTo(arr[j].name) > 0) {
					Student tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public void showStudent(Student[] arr) {
		for(int i = 0; i < arr.length;i++) {
			System.out.printf("%s : %d반 %d번 평균 : %.1f\n",arr[i].name,arr[i].ban,arr[i].no,arr[i].getAverage());
		}
		System.out.println();
	}
	
	public Student[] addStudent(Student[] arr,String name,int ban,int no,int kor, int eng, int math) {
		Student[] addstu = new Student[arr.length+1];
		for(int i = 0; i<arr.length;i++) {
			addstu[i] = arr[i];
			
		}
		
		addstu[arr.length] = new Student(name,ban,no,kor,eng,math);
	
		return addstu;
	}
	
}

