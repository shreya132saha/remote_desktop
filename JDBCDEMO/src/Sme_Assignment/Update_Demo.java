package Sme_Assignment;
import java.sql.*;
public class Update_Demo {
	public static void main(String args[])throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/EventManagement","root","root");
			//UPDATE
			PreparedStatement ps=conn.prepareStatement("update event set participant=?,fees=? where eventid=?");
			ps.setInt(1, 6);
			ps.setInt(2, 50);
			ps.setInt(3, 11);
			int res=ps.executeUpdate();
			System.out.println(res+ "record updated");
			conn.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
