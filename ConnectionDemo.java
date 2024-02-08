package demo;

import java.sql.*;
public class ConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost/learn_jdbc";
		String username ="root";
		String password ="Dhruva@123";
		// uploading driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establishing connection
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("connection esatblish succsesfully" +con);
		

	}

}
