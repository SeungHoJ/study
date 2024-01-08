package ex03;

import java.sql.Date;

public class ReviewDTO {
	private int idx;
	private String image;
	private String storeName;
	private String content;
	private Date visitDate;
	
	/*
	 create sequence review_seq
	 	start with 1
	 	maxvalue 99999
	 	increment by 1
	 	nocycle
	 	nocache;
	 	
	 create table review(
	 	idx 		number			default review_seq.nextval primary key,
	 	image		varchar2(200)	not null,
	 	storename	varchar2(100)	not null,
	 	content		varchar2(2000)	not null,
	 	visitdate	date			not null
	 );
	 */
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	
}
