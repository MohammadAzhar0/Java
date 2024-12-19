//Program to create a checkbox and ItemListener to it.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class awtdemo extends Applet implements ActionListener, ItemListener
{
TextField name, pass;
Checkbox java, db,m,f;
CheckboxGroup cbg;
Choice cs;
TextArea text;
String msg="";
String val = "Java SE 6 is the latest version of the most\n";
public void init()
{
setLayout(new FlowLayout());
Label namep = new Label("Name: ");
Label passp = new Label("Password: ");
name = new TextField(12);
pass = new TextField(8);
pass.setEchoChar('?');
java= new Checkbox("Java");
db = new Checkbox("Oracle");
cbg = new CheckboxGroup();
m= new Checkbox("Male", cbg, true);
f = new Checkbox("Female", cbg, false);
cs= new Choice();
text = new TextArea(val, 10, 30);
cs.add("CSE");
cs.add("IT");
cs.add("MECH");
cs.add("CIVIL");
add(namep);
add(name);
add(passp);
57
add(pass);
add(java);
add(db);
add(m);
add(f);
add(cs);
add(text);
name.addActionListener(this);
pass.addActionListener(this);
java.addItemListener(this);
db.addItemListener(this);
m.addItemListener(this);
f.addItemListener(this);
cs.addItemListener(this);
}
public void actionPerformed(ActionEvent ae)
{
repaint();
}
public void itemStateChanged(ItemEvent ie) {
repaint();
}
public void paint(Graphics g)
{
g.drawString("Name: " + name.getText(), 2, 140);
g.drawString("Password: " + pass.getText(), 2,160);
if(java.getState())
g.drawString("programming language: " +java.getLabel(),2,180) ;
else
g.drawString("No Programming language",2,180);
if(db.getState())
g.drawString("Database: " +db.getLabel(),2,200) ;
else
g.drawString("No database",2,200);
g.drawString(cbg.getSelectedCheckbox().getLabel(),2,220);
g.drawString(cs.getSelectedItem(),2,240);
}}
