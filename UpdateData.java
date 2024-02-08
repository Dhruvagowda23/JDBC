package demo;
import java.sql.*;
public class UpdateData {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost/learn_jdbc";
		String username ="root";
		String password ="Dhruva@123";
		// sql queery
		String sql = "UPDATE student SET roll =2 WHERE name= 'dhruva'";
		// connection establish
		Connection con=DriverManager.getConnection(url, username, password);
		// passing the statement to sql
		Statement st=con.createStatement();
		st.executeUpdate(sql);
		System.out.println("student is created"+st);

	}

}

	


