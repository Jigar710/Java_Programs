import java.applet.*;
import java.awt.*;
public class CircleDemo extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(10,10,100,100);
		g.drawOval(10,10,100,100);
	}
}
/*
<applet code=CircleDemo width=500 height=500>
</applet>
*/

