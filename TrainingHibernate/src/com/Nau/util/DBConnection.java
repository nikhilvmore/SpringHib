package com.Nau.util;

import java.sql.DriverManager;

public class DBConnection {
public static void main(String arg[]){
		
	try{
		//oracle.jdbcOracleDriver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded");
		String url = "jdbc:mysql://localhost:3306/test";
		//url=jdbc:oracle:thin@localhoist:1521.XE
		//hibernate
		//String url = "jdbc:mysql://172.121.124.69:3306/test";
		String username="root";
		String password="root";
		DriverManager.getConnection(url,username,password);
		System.out.println("connected");
	}catch(Exception e){
		e.printStackTrace();
	}
}

}
