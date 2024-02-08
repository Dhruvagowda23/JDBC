package demo;

import java.sql.*;
import java.util.Scanner;

public class InsertingDynamicData {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost/learn_jdbc";
		String username ="root";
		String password ="Dhruva@123";
		// sql queery
		String sql = "INSERT INTO student VALUES(?,?)";
		// user Input
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter roll");
		int roll=sc.nextInt();
		sc.nextLine();
		System.out.println("please enter name");
		String name =sc.nextLine();
		
		// connection establish
		Connection con=DriverManager.getConnection(url, username, password);
		// passing the statement to sql
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,roll);
		ps.setString(2, name);
		// execute update
		ps.executeUpdate();
		
		

	}

}
