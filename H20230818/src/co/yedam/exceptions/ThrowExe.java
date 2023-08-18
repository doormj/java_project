package co.yedam.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ThrowExe {
	public static void main(String[] args) {
		try {
			dbSearch();
		} catch (ClassNotFoundException | SQLException e) {	//or 구분으로 동시 작용 //Exception 통일가능
			e.printStackTrace();
		}
	}
	
	
	public static void dbSearch() throws ClassNotFoundException, SQLException { //Exception (가장 상위 클래스)
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employees");
		while(rs.next()) {
			System.out.println("사원번호 " + rs.getInt("employee_id") 
			+ " 이름 : " + rs.getString("first_name"));
		}
	}
}
