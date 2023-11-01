package book;


// 1) 단일 데이터의 배열
// 2) 데이터를 제어하기 위한 함수들

public class Handler {

	Book[] arr= new Book[5];
	int bookNum;
	int row;
	String writer;
	String name;
	
	
	
	
	
		
	void bookBorrow(int bookNum) {
		if(arr[bookNum]==null) {
			 System.out.println("선택하신 책은 이미 대여되었거나 없는 책입니다.\n");
		}
		else{
			System.out.printf("%s 을(를) 대여하였습니다.\n\n",arr[bookNum].getName());
			arr[bookNum] = null;
		 
		}
	}
	
	void bookReturn(String name,String writer) {
		for(int i = 0;i < arr.length;i++) {
			row = 0;
			if(arr[i] == null) {
				arr[i] = new Book();
				arr[i].setName(name);
				arr[i].setWriter(writer);
				arr[i].setBookNum(i);
				System.out.printf("%s 을(를) 반납하였습니다\n",arr[i].getName());
				row++;
				break;
				}
			}
		 	if(row == 0) {
			System.out.println("더이상 반납할 공간이 없습니다");
			
		 	}
		System.out.println();
	}
	
	
	
	
	void bookMenu() {
		row = 0;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] != null) {
				System.out.printf("책 번호 : %d, 제목 : %s,작가 : %s\n\n",
				arr[i].getBookNum(),arr[i].getName(),arr[i].getWriter());
				row++;
			}
		}
		
		if(row == 0){
			System.out.println("현재 대여 가능한 책이 없습니다\n");
			
		}
	}
	
	
	
	
	
}
