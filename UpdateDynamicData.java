package demo;

import java.sql.*;
import java.util.Scanner;

public class UpdateDynamicData {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost/learn_jdbc";
		String username ="root";
		String password ="Dhruva@123";
		// sql queery
		String sql = "UPDATE student SET name=? WHERE roll=?";
		// user Input
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter roll which can be update");
		int roll=sc.nextInt();
		sc.nextLine();
		System.out.println("please enter name");
		String name =sc.nextLine();
		
		
		// connection establish
		Connection con=DriverManager.getConnection(url, username, password);
		// passing the statement to sql
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(2,roll);
		ps.setString(1, name);
		
		// execute update
		ps.executeUpdate();
		

	}

}
