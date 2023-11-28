package schedule;

import java.util.Date;

public class ScheduleDTO {

	private String title;
	private Date start_date;
	private Date end_date;
	
	@Override
	public String toString() {
		String data = "";
		data = String.format("%s : %s ~ %s\n",title,start_date,end_date);
		return data;
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_end) {
		this.end_date = end_end;
	}
	
	
}
