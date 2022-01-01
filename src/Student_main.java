import java.sql.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Student_main 
{
 
	public static void main(String[] args) 
	{
		
		Student_main s= new Student_main();
		//s.setStudentDetails();
		//s.deleteStudentInfo();
		s.updateStudentInfo();

	}
	 void setStudentDetails()
	 {				 		 
	     String DB_URL = "jdbc:mysql://localhost:3306/student_db";
	     String USER = "root";
	     String PASS = "";
	     try{
	    	 Class.forName("com.mysql.jdbc.Driver");  
	     Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
       
         
         String sql = "INSERT INTO STUDENT VALUES (100, 'Samarin','1996-11-13','2021-01-01')";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO STUDENT VALUES (101, 'sakshi','1996-08-20','2019-10-16')";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO STUDENT VALUES (103, 'Megha','1990-08-23','2019-12-25')";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO STUDENT VALUES (104, 'Varsha','1996-02-20','2019-12-25')";
         stmt.executeUpdate(sql);
         System.out.println("Inserted records into the table...");
         stmt.close();
         conn.close();
	     }catch(Exception e){
	    	 System.out.println(e);
	     }
	 }
	 void deleteStudentInfo()
	 {				 		 
	     String DB_URL = "jdbc:mysql://localhost:3306/student_db";
	     String USER = "root";
	     String PASS = "";
	     try{
	    	 Class.forName("com.mysql.jdbc.Driver");  
	     Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();     
         
         String sql = "DELETE FROM STUDENT WHERE Student_Name='Varsha'";
         stmt.executeUpdate(sql);
         
         System.out.println("Deleted records From the table...");
         stmt.close();
         conn.close();
	     }catch(Exception e){
	    	 System.out.println(e);
	     }
	 }
	 void updateStudentInfo()
	 {				 		 
	     String DB_URL = "jdbc:mysql://localhost:3306/student_db";
	     String USER = "root";
	     String PASS = "";
	     try{
	    	 Class.forName("com.mysql.jdbc.Driver");  
	     Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();     
         
         String sql = "UPDATE STUDENT SET Student_DOJ = '2021-12-25' WHERE Student_Name='Megha'";
         stmt.executeUpdate(sql);
         
         System.out.println("Updated record From the table...");
         stmt.close();
         conn.close();
	     }catch(Exception e){
	    	 System.out.println(e);
	     }
	 }

}
