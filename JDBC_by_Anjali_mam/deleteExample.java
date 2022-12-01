import java.sql.*;
import java.io.*;

class deleteExample
{
 static String url="jdbc:odbc:test";
 static Connection con=null;
 static Statement stmt;
 public static void main(String args[])
 {
  try
  {
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   con=DriverManager.getConnection(url);
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter class to delete records");
   String s=br.readLine();
   String str="Delete from student where sclass='" + s +"'";
   stmt=con.createStatement();
   int n=stmt.executeUpdate(str);
   System.out.println(n + " records deleted");
   stmt.close();
   con.close();
  }
  catch(IOException ie)
  {
   System.err.println("IOException: "+ie.getMessage());
  }
  catch(SQLException e)
  {
   System.err.println("SQLException: "+e.getMessage());
  }
  catch(Exception ex)
  {
   System.err.println("A problem occurred: "+ex.getMessage());
  }
 }
}
