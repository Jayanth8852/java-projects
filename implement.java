import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class keyboardEvets extends applets implementing keylistener
{
string str="";
public void init() 
{
addkeylistener(this);
requestfocus()
}
public void key typed(keyEvent e)
{
str+=e.getkeychar();
repaint(0);
}
public void keypassesd(keyEvent e)
{
show status("key pressed");
}
public void keyReleased(keyEvent e)
{
showstatus("keypressed");
}
public void keyreleased(keyevent e)
{
showStatus("key released");
}
public void paint(graphics g)
{
g.drawstring(st, 15,15);
}
}
