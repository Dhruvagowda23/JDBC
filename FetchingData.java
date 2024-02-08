package demo;


import java.sql.*;

public class FetchingData {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost/learn_jdbc";
		String username ="root";
		String password ="Dhruva@123";
		// sql queery
		String sql = "SELECT * FROM student";
		// connection establish
		Connection con=DriverManager.getConnection(url, username, password);
		// passing the statement to sql
		Statement st=con.createStatement();
		ResultSet rs =st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+":"+rs.getString(2));
		}

	}

}
