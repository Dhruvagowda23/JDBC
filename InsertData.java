package demo;

import java.sql.*;

public class InsertData {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost/learn_jdbc";
		String username ="root";
		String password ="Dhruva@123";
		// sql queery
		String sql = "INSERT INTO student VALUES(6,'Ammu')";
		// connection establish
		Connection con=DriverManager.getConnection(url, username, password);
		// passing the statement to sql
		Statement st=con.createStatement();
		st.execute(sql);

	}

}

	