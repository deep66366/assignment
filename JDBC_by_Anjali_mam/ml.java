import java.awt.*;
import java.awt.event.*;

class ml extends Frame implements MouseListener
{
 Label l1;
 Panel p;
 ml()
 {
  l1=new Label();
  l1.setBounds(30,50,200,30);
  p=new Panel();
  p.setBounds(30,130,200,100);
  p.addMouseListener(this);
  setLayout(null);
  add(l1);
  add(p);
  setSize(400,300);
  setVisible(true);
 }
 
 public void mousePressed(MouseEvent e) { }

 public void mouseReleased(MouseEvent e) { }

 public void mouseClicked(MouseEvent e) 
 { 
  int x = e.getX();
  int y = e.getY();
  l1.setText("X = " + x + " Y = " + y);
 }
 
 public void mouseEntered(MouseEvent e) { }
 
 public void mouseExited(MouseEvent e) { }

 public static void main(String[] args)
 {
  new ml();
 }
}