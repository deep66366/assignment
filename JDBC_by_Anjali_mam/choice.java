import java.awt.*;
import java.awt.event.*;
class choice extends Frame implements ItemListener
{
 Choice c;
 Label l;
 TextArea t;
 choice()
 {
  c=new Choice();
  l=new Label("Your Preference");
  t=new TextArea(5,30);
  t.setEditable(false);
  c.add("C");
  c.add("C++");
  c.add("Java");
  c.add("SQL");
  c.add("PHP");
  c.add("VB.Net");
  setLayout(new FlowLayout());
  add(l);
  add(c);
  add(t);
  c.addItemListener(this);
  setTitle("Choice Example");
  setSize(400,300);
  setVisible(true);
 }
 public void itemStateChanged(ItemEvent ie)
 {
  int i,j;
  i=c.getSelectedIndex()+1;
  j=c.getItemCount();
  t.setText("You selected "+c.getSelectedItem());
  t.append("\nIt is at position " + i + " in the list");
  t.append("\nThere are " + j + " items in the list"); 
 }
 public static void main(String args[])
 {
  new choice();
 }
}




