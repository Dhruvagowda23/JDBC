package demo;

import java.sql.*;
public class DeleteData {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost/learn_jdbc";
		String username ="root";
		String password ="Dhruva@123";
		// sql queery
		String sql = "DELETE FROM student WHERE roll=1";
		// connection establish
		Connection con=DriverManager.getConnection(url, username, password);
		// passing the statement to sql
		Statement st=con.createStatement();
		st.execute(sql);

	}

}

	


