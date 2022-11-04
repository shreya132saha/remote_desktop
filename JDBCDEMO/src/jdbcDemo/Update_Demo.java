package jdbcDemo;
import java.sql.*;
public class Update_Demo {
	public static void main(String args[])throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","root");
			Statement stmt=conn.createStatement();
			String sql="Update employee SET stream= 'Python Sap' WHERE empid=13";
			int res=stmt.executeUpdate(sql);
			System.out.println("Updated");
			conn.close();
		}catch ( SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
