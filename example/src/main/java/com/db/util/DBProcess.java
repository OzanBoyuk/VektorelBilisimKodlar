package com.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBProcess {

	public Connection connection = null;
	public Statement statement = null;
	public ResultSet resultSet = null;
	
	
	public DBProcess() {
		getConnection();
		getStatement();
	}
	
	public void getConnection()
	{
		try {
			
			Class.forName("org.postgreSql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/postgres"; //postgre sql pathi ve database yolu
			String username= "postgres"; //database kullanýcý adý
			String password= "root";	 //database parolasý
			
			connection = DriverManager.getConnection(url,username,password);
			
		} catch (Exception e) {

			System.out.println("Database failed.");
			
			
		}
	}
	
	public void getStatement()
	{
		try {
			
			statement = connection.createStatement();
			
		} catch (Exception e) {

			System.out.println("Statement Failed." + e.getMessage());
			
			
			
		}
	}
	
	public void getResult(String sql)
	{
		
		try {
			
			resultSet = statement.executeQuery(sql);
			
		} catch (Exception e) {

			System.out.println("ResultSet Failed ! " );
			
			
			
		}
		
	}
	
}
