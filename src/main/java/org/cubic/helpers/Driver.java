package org.cubic.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/laliga";
		String user="root";
		String password="Kshitiz7360";
		
		try {
			//connection to database
			Connection myConn = DriverManager.getConnection(url, user, password);
			
			//create a statement
			Statement myStmt = myConn.createStatement();
			
			//execute sql query
			String sql = "insert into players"
					+ "(players_id, first_name, last_name, club, totalappea, totalgoals)"
					+ "values('14','jdd','fdfif','kfjk','20','35')";
			
			myStmt.executeUpdate(sql);
			
			System.out.println("Insert complete....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
