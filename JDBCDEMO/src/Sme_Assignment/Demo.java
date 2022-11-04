package Sme_Assignment;
import java.sql.*;
public class Demo {
	public static void main(String args[])throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/EventManagement","root","root");
			//INSERT
			PreparedStatement ps=conn.prepareStatement("insert into event values(?,?,?,?,?,?)");
			ps.setInt(1, 15);
			ps.setString(2, "Photography");
			ps.setString(3, "Gurugaon");
			ps.setInt(4, 5);
			ps.setDate(5, java.sql.Date.valueOf("2022-05-30"));
			ps.setInt(6, 30);
			int res=ps.executeUpdate();
			System.out.println(res+ "record inserted");
			conn.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

		