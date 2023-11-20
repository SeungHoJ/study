package book5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Handler {

	// 배열에서 리스트로 전환 (배열의 자료형은 리스트의 제네릭 타입이 된다)
	private ArrayList<Book> list = new ArrayList<>();
	
	/* 파일 저장 및 불러오기 함수*/
	private File f = new File("bookList.csv");
	
	public Handler() {
		if(f.exists() == false) {
			try {
				f.createNewFile();
			}catch(IOException e) {
				System.out.println("\t파일을 생성하는데에 문제가 발생했습니다 : " + e);
				e.printStackTrace();
			}
		}
	}
	
	// 저장
	public void save() {
		try {
		// 프로그램의 데이터를 파일로 내보내는 스트림(데이터의 이동 통로)
		FileOutputStream fos = new FileOutputStream(f);
		
		// 스트림으로 문자열 형식 데이터를 전달하는 기능이 추가된 클래스
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		for(Book ob : list) {
			String name = ob.getName();
			String author = ob.getAuthor();
			String publisher = ob.getPublisher();
			String price = String.valueOf(ob.getPrice());
			
			String data = String.format("%s,%s,%s,%s",name,author,publisher,price);
			osw.write(data);
			osw.write('\n');
		}
		osw.flush();
		osw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
		
	public void load() {
		try {
			Scanner sc = new Scanner(f);
			String data = "";
			while(sc.hasNextLine()) {
				data = sc.nextLine();
				if(data.length() != 0) {
					String[] arr = data.split(",");
					Book b = new Book();
					b.setName(arr[0]);
					b.setAuthor(arr[1]);
					b.setPublisher(arr[2]);
					b.setPrice(Integer.parseInt(arr[3]));
					list.add(b);
				}
			}
			sc.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	 

	void showList() {

		list.forEach(ob -> System.out.println(ob));

	}
	
	
	public int insertBook(Book ob) {
		int row = 0;
		boolean flag = list.add(ob);
		row = flag ? 1:0;
		return row;
	}
	
	int deleteBook(String name) {
		int row = 0;

		boolean flag = list.removeIf(ob -> ob.getName().equals(name));
		row = flag ? 1:0;
		return row;
	}
	
	void updateBook(String name) {
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).equals(name)) {
				System.out.printf("%s (%s,%s) : %,d원\n", list.get(i).getName(), list.get(i).getAuthor(), list.get(i).getPublisher(),
						list.get(i).getPrice());
				break;
			}
		}
	}
	
	void updateBookFromName(String searchName,String changeName) {
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).contains(searchName)) {
				list.get(i).setName(changeName);
				break;
			}
		}
	}
	
	void updateBookFromAuthor(String searchName,String name) {
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).contains(searchName)) {
				list.get(i).setAuthor(name);
				break;
			}
		}
	}
	
	void updateBookFromPublisher(String searchName,String name) {
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).contains(searchName)) {
				list.get(i).setPublisher(name);
				break;
			}
		}
	}
	
	void updateBookFromPrice(String searchName,int price) {
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getName()).contains(searchName)) {
				list.get(i).setPrice(price);
				break;
			}
		}

	}
	
}
