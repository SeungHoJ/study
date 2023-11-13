import java.sql.SQLException;
import java.util.List;

import jdbc.DAO;
import jdbc.DTO;

public class Ex10 {
	public static void main(String[] args) throws SQLException {
		// 직원 중에서 급여를 가장 많이 받는 상위 5명의 이름과 급여를 불러오기
		// DAO와 DTO 클래스를 분리했지만 같은 패키지내부에 있기 때문에
		// Ex09가 아닌 다른 파일에서도 참조하여 활용할 수 있다
		
		DAO dao = new DAO();
		List<DTO> list = dao.getQueryFromEmployeesBy5person();
		list.forEach(ob-> System.out.printf("%s : $%,d\n",ob.getFirstName(),ob.getSalary()));
	}
}
