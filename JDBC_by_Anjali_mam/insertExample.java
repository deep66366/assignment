import java.sql.*;
import java.io.*;

class insertExample
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
   System.out.println("Enter name & class");
   String sn=br.readLine();
   String sc=br.readLine();
   String str="Insert into student values('" + sn +"','"+sc+"')";
   stmt=con.createStatement();
   int n=stmt.executeUpdate(str);
   System.out.println("Record inserted");
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