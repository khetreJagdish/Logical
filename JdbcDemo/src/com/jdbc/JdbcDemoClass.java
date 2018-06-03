package com.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemoClass {

	Connection connection = null;
	public static void main(String[] args) {
		
		JdbcDemoClass jdbcDemoClass = new JdbcDemoClass();
		jdbcDemoClass.createConnection(); 
		
	}
	
	public void createConnection()
	{
		Statement statement = null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
			System.out.println("Connection Successfully established..." + connection);
		    statement = connection.createStatement();
		  //  String sqlQuery = "CREATE  TABLE  STUDENT(ROLLNO NUMBER, NAME VARCHAR2(20))";
		    
		    String sqlQuery=  "CREATE TABLE DBUSER( USER_ID NUMBER(5) NOT NULL, USERNAME VARCHAR(20) NOT NULL, CREATED_BY VARCHAR(20) NOT NULL,CREATED_DATE DATE NOT NULL,PRIMARY KEY (USER_ID))";
			
		    System.out.println("SQL QUERY : "+sqlQuery);
		    statement.execute(sqlQuery);
		    System.out.println("Table Created Successfully");
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			System.out.println("plz use another name");
			e.printStackTrace();
		}
	}

}
