package net.codejava.swing;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.SwingUtilities;
public class JListExample extendsJFrame {
private JList<String> countryList;
public JListExample() {
//create the model and add elements
DefaultListModel<String> listModel = new DefaultListModel<>();
listModel.addElement("USA");
listModel.addElement("India");
listModel.addElement("Vietnam");
listModel.addElement("Canada");
listModel.addElement("Denmark");
listModel.addElement("France");
listModel.addElement("Great Britain");
listModel.addElement("Japan");
//create the list
countryList = new JList<>(listModel);
add(countryList);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setTitle("JList Example");
this.setSize(200,200);
this.setLocationRelativeTo(null);
this.setVisible(true);
}
public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
@Override
public void run() {
new JListExample();
}
});
}
}