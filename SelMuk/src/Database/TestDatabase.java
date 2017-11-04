package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;
/*No need to download any sqljdbc.jar or sqljdbc4.jar
 * Get it downloads-Microsoft jdbc driver6.0 for sql driver-sqljdbc_6-enu-jre8-sqljdbc4jar
 * 
 * To check the sql server configuration
 * Control panel-Aministrative tools-Computer Mgmt-Services and Applications-
 * Sql Server Configuration Manager-Sql Server  network Configuration-Protocals for sql express-TCP/IP Enaled
 *  
 *  */
public class TestDatabase {
	@Test
	 public void TestVerifyDB(){
	  
	  try {
	                        
	       // This will load the driver
	    
	     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	     // database name from mgmt studio,to get user name,pwd
	     //object explorer-security-logins-sa-rt clik-ppts-changer pwd(user sa,pwd psyntel123$)
	     //if in input we get sa disabled bject explorer-security-logins-sa-rt clik-ppts-status-enabled
	     Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost; databaseName=FirstDB; user=sa;password=psyntel123$;");
	  
	     System.out.println("Driver Loaded");
	    
	        Statement smt=con.createStatement();
	        smt.executeUpdate("insert into dbo.Countries values('Hungary','Budapest')" );
	        smt.executeUpdate("insert into dbo.Countries values('Austria','Vienna')" ); 
	        con.commit();
	        System.out.println("Statement created");
	 
	 
	    
	        ResultSet rs=  smt.executeQuery("Select * from dbo.Countries");
	 
	        System.out.println("Query Executed");
	 
	  // Iterate the resultset now
	 
	       while(rs.next())
	       {
	    	   /* System.out.println(resultSet .getString(1) + "  " + resultSet.getString(2) + "  " + resultSet.getString(3) + "  "
			+ resultSet.getString(4) + "  " + resultSet.getString(5));*/
	   
	       String COUNTRY=    rs.getString("Country");
	       String CITY=        rs.getString("City");
	      
	 
	        System.out.println("COUNTRY is "+COUNTRY+" CITY is "+CITY);
	   
	       }
	}
	        catch (Exception e) {
	         System.out.println("Exception is   "+e.getMessage());
	  }
	   
	  
	 }

}
