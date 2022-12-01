import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;
class UserLogin extends Frame implements ActionListener
{
    TextField t,p;
    Button b;
    Label l1,l2;
    UserLogin()
    {
        t = new TextField(20);
        p = new TextField(20);
        p.setEchoChar('*');
		l1 = new Label("Username");
        l2 = new Label("Password");
        b = new Button("Login");
        b.addActionListener(this);
		setLayout(new FlowLayout());
		setTitle("Login Page");
		setVisible(true);
		setSize(400,300);
		add(l1);add(t);add(l2);add(p);add(b);
    }
    public void actionPerformed(ActionEvent e) 
    {
                String userName = t.getText();
                String password = p.getText();
                try 
				 {
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  Connection con =  DriverManager.getConnection("jdbc:odbc:test");
                    Statement st = con.createStatement();
					  String s="Select uname, password from login where uname='" + userName + "' and password='" + password + "'";
                    ResultSet rs = st.executeQuery(s);
                    if (rs.next()) 
                    {
                        JOptionPane.showMessageDialog(this, "You have successfully logged in");
                    } 
					  else 
					  {
                        JOptionPane.showMessageDialog(this, "Wrong Username & Password");
                     }
                } 
				 catch (SQLException se)
				 {
                    System.err.println("SQL Exception:" + se.getMessage());
                }
				 catch(Exception ex)
			 	 {
					System.out.println("Exception:" + ex.getMessage());
				 }
     }
	 public static void main(String args[])
     {
		 new UserLogin();
	 }
}

