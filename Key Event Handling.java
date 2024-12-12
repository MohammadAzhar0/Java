Key Event Handling
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class KeyEventDemo extends Applet implements KeyListener
{
String msg="";
public void init()
{
addKeyListener(this);
}
public void keyPressed(KeyEvent k)
{
showStatus("KeyPressed");
}
public void keyReleased(KeyEvent k)
{
showStatus("KeyRealesed");
}
public void keyTyped(KeyEvent k)
{
msg = msg+k.getKeyChar();
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg, 20, 40);
}}