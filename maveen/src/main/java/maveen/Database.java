package maveen;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Database 
{

	public Student getInformation(int id)
	{
		Student s1 = new Student();
		
	 try
	 {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
	     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Ravi@1995");
	     Statement st = con.createStatement();
	     ResultSet rs = st.executeQuery("SELECT * FROM PERSON WHERE ID = " + id);
	     if(rs.next())
	       {
	    	s1.setId(rs.getInt(1));
	    	s1.setAge(rs.getInt(2));
	    	s1.setName(rs.getString(3));
	       }
	 }
	 
	 catch(Exception e)
	 {
		 System.out.println(e.getStackTrace());
	 }
	     return s1;
		
 }

}
