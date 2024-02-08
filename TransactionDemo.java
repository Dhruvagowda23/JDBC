package demo;

import java.sql.*;
public class TransactionDemo {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost/learn_jdbc";
		String username ="root";
		String password ="Dhruva@123";
		// sql queery
		String sql1 = "UPDATE bank SET balance = 10000 WHERE acc_number= 101";
		String sql2 = "UPDATE bank SET balance = 5000 WHERE acc_number= 102";
		// connection establish
		Connection con=DriverManager.getConnection(url, username, password);
		// passing the statement to sql
		Statement st=con.createStatement();
		st.executeUpdate(sql1);
		st.executeUpdate(sql2);
	
	}

}
