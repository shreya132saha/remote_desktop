package Sme_Assignment;
import java.sql.*;
public class Delete_Demo {

	public static void main(String args[])throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/EventManagement","root","root");
			//DELETE
			PreparedStatement ps=conn.prepareStatement("delete from event where eventid=?");		
			ps.setInt(1, 14);
			int res=ps.executeUpdate();
			System.out.println(res+ "record deleted");
			conn.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}
}
