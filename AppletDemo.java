import java.util.Date;
import java.applet.Applet;  
import java.awt.Graphics;  
public class AppletDemo extends Applet
{
Date d=new Date();
public void paint(Graphics g)
{
g.drawString(d.toString(),100,100);
g.drawString("hello",200,300);
}
}
/*<applet code="AppletDemo" width="300" height="300"> 
</applet> */