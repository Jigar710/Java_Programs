import java.awt.*;
import java.applet.*;

public class traffic1 extends Applet implements Runnable
{
	int x,y,w,h;
	Color c[] = {Color.RED,Color.yellow,Color.GREEN};
	public traffic1()
	{
		
	}
	public void paint(Graphics g)
	{
		x = y = 100;
		w = h = 100;
		
		g.setColor(Color.black);
		g.fillRect(x,y,w,h*3);
		
		for(int i=0;i<c.length;i++)
		{
			g.setColor(c[i]);
			g.fillOval(x,y,w,h);
			y = y + h;
		}		
	}
	public void run()
	{
	}
}

/*
<applet code=traffic1 width=500 height=500>
</applet>
*/
