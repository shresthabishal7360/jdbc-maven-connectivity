package org.cubic.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.cubic.helpers.DataBaseConnection;

public class mainApplication {

	public static void main(String[] args) {
		System.out.println("First test run");
		Connection c = DataBaseConnection.createConnection();
		/*String insertSql="insert into customers(first_name,last_name,phone,email,address,gender,dob)" + 
				"values('ravi','khadka','67676','dieifwe','sdjfh','M','1995-04-05')";
		String insertSq1="insert into customers(first_name,last_name,phone,email,address,gender,dob)" + 
				"values('rav','khadk','6766','dieife','sdjfh','M','1995-04-05')";*/
		 
		Statement stmt = null;
		try {
			 stmt = c.createStatement();
			/*stmt.executeUpdate(insertSql);
			stmt.executeUpdate(insertSq1);*/
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		//select 
		String selectSql= "select * from customers"; 
		try {
			ResultSet rs = stmt.executeQuery(selectSql);
			while(rs.next()) {
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				String email = rs.getString("email");
				int phone = rs.getInt("phone");
				System.out.println("Name : "+ first_name+ " "+ "LastName : "+ last_name + "Phone : "+ phone + "  "+"email :"+ email);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
		c.close();
		} catch (Exception e) {
			
		}
		/*finally { 
			try {
				c.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		*/
		

	}

}
