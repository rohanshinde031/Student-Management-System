package com.growstar.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnnection {

	  public static Connection getConnection() throws Exception {
	        Class.forName("com.mysql.cj.jdbc.Driver");  // for MySQL 8+
	        return DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/empdb", "root", "root");
	    }
}
