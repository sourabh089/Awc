package Evan;

import java.io.*;
import java.sql.*;

public class SapApprover {
public static void main(String[] args) {
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection(
"jdbc:oracle:thin:@localhost:1521:orc","saurav","saurav");
			
PreparedStatement ps=con.prepareStatement("select * from dave");
ResultSet rs=ps.executeQuery();
rs.next();//now on 1st row
	
while(rs.next()){
    //Retrieve by column name
    int id  = rs.getInt("ID_NO");
  
    String first = rs.getString("NAME");
  

    //Display values
    System.out.print("ID: " + id);
  
    System.out.print(", First: " + first+"\n");
  
 }		    
rs.close();
con.close();
			
System.out.println("success");
}catch (Exception e) {e.printStackTrace();	}
}
}