package schedule;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Handler handler = new Handler();
		String title;
		Date start_date, end_date;
		int menu = -1;
		int row;
		SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd");
//		SimpleDateFormat outputFormatter = new SimpleDateFormat("yyyy년 MM월 dd일");
//		Date date = null; // java.util.Date는 java.sql.Date의 슈퍼클래스이다
		List<ScheduleDTO> list = null;
		String now = handler.getSysdate();

		while (menu != 0) {
			System.out.println("=== DB기준 현재시간 ===");
			System.out.println(now);
			System.out.println("1. 전체 출력");
			System.out.println("2. 월별 검색");
			System.out.println("3. 일정 등록");
			System.out.println("4. 일정 삭제");
			System.out.println("0. 종료");
			System.out.print("입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 123:
				// 오라클 데이터베ㅣ스 버전 정보를 문자열로 출력하기
				// select banner from v$version
				handler.showVersion();
				break;
			case 1:
				list = handler.selectAll();
				list.forEach(ob -> System.out.print(ob));
				break;
			case 2:
				System.out.print("검색할 월 입력 : ");
				String month = sc.nextLine();
				list = handler.searchByMonth(month);
				list.forEach(ob -> System.out.print(ob));
				break;
			case 3:
				System.out.print("일정명 입력 : ");
				title = sc.nextLine();
				System.out.println("시작일 입력(YYYY-MM-DD) : ");
				start_date = inputFormatter.parse(sc.nextLine());
				System.out.println("종료일 입력(YYYY-MM-DD) : ");
				end_date = inputFormatter.parse(sc.nextLine());
				ScheduleDTO dto = new ScheduleDTO();
				dto.setTitle(title);
				dto.setStart_date(start_date);
				dto.setEnd_date(end_date);
				row = handler.setSchedule(dto);
				System.out.printf("%d 행이 추가되었습니다\n",row);
				break;
			case 4:
				System.out.print("삭제할 일정명 입력 : ");
				title = sc.nextLine();
				row = handler.deleteSchedule(title);
				System.out.printf("%d 행이 삭제되었습니다\n",row);
				break;
			case 0:
				break;

			}
		}
		sc.close();

	}
}
