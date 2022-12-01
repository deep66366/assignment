import java.awt.*;
import java.awt.event.*;
class rbdemo extends Frame implements ItemListener
{
 Checkbox r1,r2;
 CheckboxGroup cg;
 rbdemo()
 {
  setTitle("Checkbox with ItemListener demo");
  setLayout(new FlowLayout());
  r1=new Checkbox("Male");
  r2=new Checkbox("Female");
  r1.addItemListener(this);
  r2.addItemListener(this);
  cg=new CheckboxGroup();
  r1.setCheckboxGroup(cg);
  r2.setCheckboxGroup(cg);
  add(r1);
  add(r2);
  setSize(400,400);
  setVisible(true);
 }
 public void itemStateChanged(ItemEvent ie)
 {
  setTitle(ie.getItem()+" is selected");
 }
 public static void main(String args[])
 {
  new rbdemo();
 }
}