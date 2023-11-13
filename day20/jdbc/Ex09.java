package jdbc;


import java.util.List;

public class Ex09 {
	public static void main(String[] args)throws Exception {
		DAO dao = new DAO();
		List<DTO> list = dao.getQueryFromEmployees();
		list.forEach(ob-> System.out.printf("%s : $%,d\n",ob.getFirstName(),ob.getSalary()));
	}
}
