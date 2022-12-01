import java.awt.*;
import java.awt.event.*;
class shortMouseDemo extends Frame //implements MouseListener
{
 Label l1;
 shortMouseDemo()
 {
  l1= new Label("");
  l1.setBounds(30,50,200,30);
  addMouseListener(new MouseAdapter()
                   
{
   
                 public void mouseClicked(MouseEvent e)

                    {
                     int x=e.getX();
                     int y=e.getY();
                     l1.setText("X= "+x+ "Y ="+y);
                     setBackground(Color.green); 
                    }

                    public void mouseExited(MouseEvent e)

                    {
                     l1.setText(" hello !");
                     setBackground(Color.yellow); 
                    }

                   });
  setLayout(null);
  add(l1);
  setSize(400,300);
  setVisible(true);
 }
public static void main(String a[])
 { 
  new shortMouseDemo();
 }
}