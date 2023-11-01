package book;


// 단일 데이터를 필드와 getter/setter로 구성

public class Book {
	int bookNum;
	String name;
	String writer;
	
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getName() {
		return name;
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
