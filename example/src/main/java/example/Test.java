package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws SQLException {
		//Postgre sql driver package url i
		try {
			
			Class.forName("org.postgresql.Driver");//bulmazsa catch e düþsün
			String url = "jdbc:postgresql://localhost:5432/postgres"; //postgre sql pathi ve database yolu
			String username= "postgres"; //database kullanýcý adý
			String password= "root";	 //database parolasý
			
			Connection connection = DriverManager.getConnection(url,username,password); //Once Connection
		
			
			
			String query = "Select first_name from actor";
			
			Statement stmt = connection.createStatement(); //Connection uzerinden bir statement olusturursun
			
			ResultSet resulSet = stmt.executeQuery(query); // Statement üzerinde bir query çalýþtýrýrsýn.
			
			while (resulSet.next()) {
				System.out.println(resulSet.getString("first_name")); 
			}
			
			if (connection != null) {
				System.out.println("Connection Succesful.");
			}else {
				System.out.println("Connection Failed.");
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
