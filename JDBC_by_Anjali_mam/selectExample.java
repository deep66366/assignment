import java.sql.*;
class selectExample
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
   String str="select sclass, sname from student";
   String result="SNAME\t\tCLASS\n";
   stmt=con.createStatement();
   ResultSet rs=stmt.executeQuery(str);
   while(rs.next())
   {
    String en=rs.getString("sname");
    String j=rs.getString("sclass");
    result+=en+"\t\t"+j+"\n";
   }
   System.out.println(result);
   stmt.close();
   con.close();
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
