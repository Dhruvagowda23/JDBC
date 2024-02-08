package demo;
import java.sql.*;

public class CreateTable {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost/learn_jdbc";
		String username ="root";
		String password ="Dhruva@123";
		// sql queery
		String sql = "CREATE TABLE student(roll INT,name VARCHAR(10))";
		// connection establish
		Connection con=DriverManager.getConnection(url, username, password);
		// passing the statement to sql
		Statement st=con.createStatement();
		st.execute(sql);

	}

}
