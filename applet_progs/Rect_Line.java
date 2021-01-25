import java.applet.*;
import java.awt.*;
public class Rect_Line extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(10,10,60,10);
		g.drawLine(60,10,60,100);
		g.drawLine(60,100,10,100);
		g.drawLine(10,10,10,100);
	}
}
/*
<applet code=Rect_Line width=234 height=234>
</applet>
*/