import java.awt.*;
import java.awt.event.*;
public class cbdemo extends Frame implements ItemListener
{
 Checkbox cb1, cb2;
 Label l1;
 cbdemo()
 {
  cb1 = new Checkbox("JAVA");
  cb2 = new Checkbox("PHP");
  l1 = new Label();
  setLayout(new FlowLayout());
  add(cb1);
  add(cb2);
  cb1.addItemListener(this);
  cb2.addItemListener(this);
  setTitle("Checkbox & Item Listener");
  setSize(400,300);
  setVisible(true);
 }
 public void itemStateChanged(ItemEvent e)
 {
  //Checkbox ch =(Checkbox)e.getItemSelectable();
  Checkbox ch =(Checkbox)e.getSource();
  if(ch.getState()==true)
  {
   l1.setText("You selected " + ch.getLabel());
   add(l1);
   setVisible(true);
  }
  else
  {
   l1.setText("You deselected " + ch.getLabel ());
   add(l1);
   setVisible(true);
  }
 }
 public static void main(String[] ar)
 {
  new cbdemo();
 }
}