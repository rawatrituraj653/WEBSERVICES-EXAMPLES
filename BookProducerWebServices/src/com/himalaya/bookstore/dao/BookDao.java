package com.himalaya.bookstore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BookDao {
	
	private BookDao() {}
	private static Connection connection=null;
	
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			System.out.println(connection);
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
		
			return connection;
	}
	
}
