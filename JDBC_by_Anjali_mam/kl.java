import java.awt.*;
import java.awt.event.*;

class kl extends Frame implements KeyListener
{
 Label l1,l2;
 TextArea a;
 kl()
 {
  l1=new Label();
  l2=new Label();
  l1.setBounds(30,50,200,30);
  l2.setBounds(30,90,200,30);
  a=new TextArea();
  a.setBounds(30,130,100,100);
  a.addKeyListener(this);
  setLayout(null);
  add(l1);
  add(l2);
  add(a);
  setSize(400,300);
  setVisible(true);
 }
 public void keyPressed(KeyEvent e) { }

 public void keyReleased(KeyEvent e)
 {
  String t=a.getText();
  l1.setText("No. of Characters: "+ t.length());
  l2.setText("Key Code is " + e.getKeyCode());
 }

 public void keyTyped(KeyEvent e) { }

 public static void main(String[] args)
 {
  new kl();
 }
}