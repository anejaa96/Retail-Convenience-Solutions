package edu.ecu.retailconveniencesolutions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterAccountController {
	
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/retailconveniencesolutions";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "mysqluser";

	public boolean addAccountToDB(User user) {
		
		System.out.println(user.toString());
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		String sql = "INSERT INTO user (first_name, last_name, email, street_address, zip_code, username, password) VALUES (?, ?, ?, ?, ?, ?, ?);";
		
		try {
			
			Class.forName(DB_DRIVER);  
			connection = DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASSWORD);  
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getFirstName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getStreetAddress());
			preparedStatement.setString(5, user.getZipCode());
			preparedStatement.setString(6, user.getUsername());
			preparedStatement.setString(7, user.getPassword());
			
			preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}

}
