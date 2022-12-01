import java.awt.*;
import java.awt.event.*;
class mnu extends Frame implements ActionListener
{
 MenuBar mb;
 Menu m;
 MenuItem r;
 mnu()
 {
  mb=new MenuBar();
  m=new Menu("Color");
  r=new MenuItem("Red");
  setMenuBar(mb);
  m.add(r);
  mb.add(m);
  r.addActionListener(this);
  setSize(200,150);
  setTitle("Menu");
  setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
  setBackground(Color.red);
 }
}
class mymenu
{
 public static void main(String args[])
 {
  mnu ob=new mnu();
 }
}