package com.anilt.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection
{

  public static Connection conn;
  public static String databaseServer;
  public static String databaseName;
  public static String databaseUserName;
  public static String databaseServerPort;
  public static String databaseJDBCDriver;
  public static String databaseUserPassword;

  public static Connection getConnection() throws ClassNotFoundException, SQLException
  {
    if (conn == null)
    {
      // readProperties();

      // Class.forName("com.mysql.jdbc.Driver");
      // conn =
      // DriverManager.getConnection("jdbc:mysql://school.c77jiymlibj9.us-west-2.rds.amazonaws.com:3306/school",
      // "root", "sreedhar");
      StringBuilder connectionString = new StringBuilder();
      connectionString.append("jdbc:mysql://");
      connectionString.append(databaseServer);
      connectionString.append(":");
      connectionString.append(databaseServerPort);
      connectionString.append("/");
      connectionString.append(databaseName);
      Class.forName(databaseJDBCDriver);
//      conn = DriverManager.getConnection(connectionString.toString(), databaseUserName, databaseUserPassword);
      conn = DriverManager.getConnection(connectionString.toString(), "root", "$9Lserver");
    }
    return conn;
  }
  public static void main(String[] args) throws SQLException 
  {
	  try 
	  {
		  PreparedStatement ps = null;
		  Class.forName("com.mysql.jdbc.Driver");
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_anil","root", "$9Lserver");
		 System.out.println(conn.toString());
		 ps = conn.prepareStatement("select idemp, name, email from emp where name= ? ");
			ps.setString(1, "anil");
			ResultSet rs = ps.executeQuery();
			if (rs.next())
			{
				System.out.println("Name: "+ rs.getString("name"));
				System.out.println("Email: "+ rs.getString("email"));
			}
	
	  } 
	  catch (ClassNotFoundException e) 
	  {
		e.printStackTrace();
	}
      
  }

}
