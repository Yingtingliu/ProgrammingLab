package ttest;

import java.sql.*;
import java.util.Properties;

public class DBConnection {

	private static final String JDBC_DRIVER = 
			"com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String DB_URL = 
			"jdbc:sqlserver://localhost:1433;databaseName=REprice";
	private static final String USER = "sa";
	private static final String PASSWORD = "passw0rd";
	
	private Connection conn = null;
	public Connection getConn(){
		
        try {

        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        //System.out.println("Connected to the database");
        conn.createStatement();

    } catch (Exception e) {
        System.out.println("Error!!!");
    }
		return conn;
	}
}
