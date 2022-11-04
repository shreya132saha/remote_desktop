package jdbcDemo;
import java.sql.*;
public class Prepare_statement_demo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","root");
			/*PreparedStatement ps=conn.prepareStatement("SELECT * from EMPLOYEE");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				//getting all tne rows by col index/col name
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getDate(5));
			
			}*/
			/*INSERT
			PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?,?,?)");
			ps.setInt(1, 4);
			ps.setString(2, "Ravi");
			ps.setString(3, "Salesforce.com");
			ps.setString(4, "Bangalore");
			ps.setDate(5, java.sql.Date.valueOf("2022-12-05"));*/
			
			
			/*UPDATE
			PreparedStatement ps=conn.prepareStatement("update employee set location=?,stream=? where empid=?");
			ps.setString(1, "Pune");
			ps.setString(2, "SAP");
			ps.setInt(3, 4);*/
			
			//DELETE
			PreparedStatement ps=conn.prepareStatement("delete from employee where empid=?");
			
			ps.setInt(1, 4);
			int res=ps.executeUpdate();
			System.out.println(res+ "record deleted");
			conn.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

	}


