import java.applet.*;
import java.awt.*;
public class ArcDemo extends Applet
{
	public void paint(Graphics g)
	{
		g.drawArc(10,10,100,100,0,90);
		g.drawRect(10,100,100,100);
		g.drawOval(10,100,100,100);
		g.fillArc(10,100,100,100,0,90);
		
		g.fillArc(10,100,100,100,180,90);
	}
}
/*
<applet code=ArcDemo width=500 height=500>
</applet>
*/

