import java.applet.*;
import java.awt.*;
public class ArcDemo1 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillArc(10,100,100,100,0,90);		
		g.setColor(Color.YELLOW);
		g.fillArc(10,100,100,100,90,90);		
		g.setColor(Color.BLUE);
		g.fillArc(10,100,100,100,180,90);
		g.setColor(Color.GREEN);
		g.fillArc(10,100,100,100,270,90);		
	}
}
/*
<applet code=ArcDemo1 width=500 height=500>
</applet>
*/

