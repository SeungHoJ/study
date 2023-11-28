package schedule;


import java.util.List;

public class Handler {

	private ScheduleDAO dao = new ScheduleDAO();
	
	public List<ScheduleDTO> selectAll() {
		
		return dao.selectAll();
	}

	public void showVersion() {
		
		dao.showVersion();
	}

	public List<ScheduleDTO> searchByMonth(String month) {
		
		return dao.searchByMonth(month);
	}

	public String getSysdate() {
		
		return dao.getSysdate();
	}

	public int setSchedule(ScheduleDTO dto) {
		
		int row = dao.setSchedule(dto);
		return row;
		
	}

	public int deleteSchedule(String title) {
		
		int row = dao.deleteSchedule(title);
		return row;
		
	}

}
