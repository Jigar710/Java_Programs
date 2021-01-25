import java.applet.*;
import java.awt.*;
public class ArcDemo2 extends Applet
{
	Color c[] = {Color.RED,Color.YELLOW,Color.orange,Color.GREEN,Color.blue,Color.white,Color.blak};
	int angle;
	int i,x,y;
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillArc(10,100,100,100,0,90);		
	}
}
/*
<applet code=ArcDemo2 width=500 height=500>
</applet>
*/

