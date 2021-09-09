package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlJdbcPreparedStatementTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		 //Load the driver class
		  Class.forName("com.mysql.cj.jdbc.Driver");

	      //Establish the Connection b/w JavaPgm to MySql
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon","root","root");
		  
		  PreparedStatement st = con.prepareStatement("create table Persons(id int,name char(10), address varchar(50))");
		  System.out.println("Connection got successful" +"\n"+con);
		  			  
		  int j = st.executeUpdate("insert into Persons values(111, 'Naresh', 'Kphb')");
		  System.out.println(j);
		  int k=st.executeUpdate("update Persons set id=222 where id=111");
		  System.out.println(k);
		  int l=st.executeUpdate("delete from Persons where id=222");
		  System.out.println(l);
		  
		  int a = st.executeUpdate("drop table Persons");
		  System.out.println(a);	
		  
		  //Close the Connections
		  st.close();
		  con.close();

	}

}
