package database.pkware.com;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

public class DbConnectionPostGres {
	static String driverClassName="org.postgresql.Driver";
	static String url="jdbc:postgresql://192.168.2.180/practice_db";
	static String username="postgres";
	static String password="postgres";
	static String query="insert into practice_db.students(id,name) values (1,'Akshat')";
	

	public static void main (String[] args) throws SQLException{
		Connection conn=getConnection();
		
		Statement st=conn.createStatement();
		int count=st.executeUpdate(query);
		System.out.println("Number of rows effected by this query"+count);
		st.close();
		conn.close();
		

	}
	
	public static Connection getConnection() throws SQLException{
		Connection conn=null;
		try {
			Class.forName(driverClassName);
			conn=DriverManager.getConnection(url,username,password);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
