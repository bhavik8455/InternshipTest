package main;

import java.sql.*;

public class Main {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			PreparedStatement preparedStatement = connection.prepareStatement("insert into emp values(?,?)");
			preparedStatement.setInt(1, 12);
			preparedStatement.setString(2, "BHAVIK");
			preparedStatement.executeUpdate();
			System.out.println("inserted..");
			
			
			
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	

}
