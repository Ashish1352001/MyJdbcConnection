package com;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class MyConClass {	
	
	public void MyConnection()  {
		System.out.println("I am in connection class");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Driver myDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(myDriver);
			
			String url = "jdbc:mysql://localhost:3306/my_jdbc";
			String UserName="root";
			String Password="root";			
			Connection conn = DriverManager.getConnection(url, UserName, Password);			
			Statement stmn = conn.createStatement();
			
			String myQuerry = "insert into mytable values ('4','Athrva','Devloper', 50000);";
			stmn.executeUpdate(myQuerry);
			System.out.println("Query executed succesfully");
			conn.close();
			
			
			
		}catch(Exception e) {
			System.out.println("Database exception==>"+e);
		}		
	}
	
public void DeleteMethod() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver myDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(myDriver);			
			String url = "jdbc:mysql://localhost:3306/my_jdbc";
			String UserName="root";
			String Password="root";			
			Connection conn = DriverManager.getConnection(url, UserName, Password);			
			Statement stmn = conn.createStatement();
			
			String DeleteQuery = "delete from mytable where id = '3';";
			stmn.executeUpdate(DeleteQuery);
			conn.close();
			System.out.println("Query executed succesfully");
			
			
			
			
		}catch(Exception e) {
			
			
		}
		
		
	}

public void MyUpdateQuerry() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Driver myDriver = new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(myDriver);			
		String url = "jdbc:mysql://localhost:3306/my_jdbc";
		String UserName="root";
		String Password="root";			
		Connection conn = DriverManager.getConnection(url, UserName, Password);			
		Statement stmn = conn.createStatement();
		
		String updateQuery = "UPDATE `mytable` SET `Salary` = '55000' WHERE (`id` = '4');\r\n"
				+ "";
		stmn.executeUpdate(updateQuery);
		conn.close();
		System.out.println("Query executed succesfully");
		
	}catch(Exception e) {
		
	}
}



	public static void main(String[] args) {		
		MyConClass m = new  MyConClass();
		//m.MyConnection();
		//m.DeleteMethod();
		m.MyUpdateQuerry();
	}
}
