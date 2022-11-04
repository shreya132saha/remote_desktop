package jdbcDemo;
import java.sql.*;
public class Demo1 {

	public static void main(String args[])throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","root");
			Statement stmt=conn.createStatement();
			String sql="Select * from employee";
			
			
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				//getting all the rows by col index/col name
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getDate(5));
			
			}
			/*to insert rows
			int res=stmt.executeUpdate("insert into employee values(13,'Ranjan','Python','Chennai','2022-11-07')");
			System.out.println(res+ "record inserted");*/
			
			
			
		}catch ( SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
