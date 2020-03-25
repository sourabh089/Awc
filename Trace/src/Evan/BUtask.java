package Evan;



import java.io.*;
import java.sql.*;

public class BUtask {
public static void main(String[] args) {
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection(
"jdbc:oracle:thin:@localhost:1521:orc","saurav","saurav");
			

String query="SELECT CASE " + 
		"         WHEN :BU IN ('01','07','03','04') " + 
		"         THEN xxtmx_pa_bgt_cst_cnh(1,1) " + 
		"         WHEN :BU IN ('08','101') " + 
		"         THEN xxtmx_pa_bgt_cst_pw(1,1) " + 
		"         ELSE xx"
		+ "tmx_pa_bgt_cst_val(1,1) " + 
		"         END buget_cost " + 
		"         FROM DUAL " ;
	



PreparedStatement ps=con.prepareStatement(query);
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
}catch (Exception e) 
{System.out.println("exception "+e);	
}
}
}
