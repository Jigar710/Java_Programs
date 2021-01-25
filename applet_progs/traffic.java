import java.awt.*;
import java.applet.*;

public class traffic extends Applet implements Runnable
{
	int x,y,w,h;
	public traffic()
	{
		
	}
	public void paint(Graphics g)
	{
		x = y = 100;
		w = h = 100;
		g.fillRect(x,y,w,h*3);
		
		g.setColor(Color.RED);
		g.fillOval(x,y,w,h);
		y = y + h;
		g.setColor(Color.YELLOW);
		g.fillOval(x,y,w,h);
		y = y + h;
		g.setColor(Color.GREEN);
		g.fillOval(x,y,w,h);
	}
	public void run()
	{
	}
}

/*
<applet code=traffic width=500 height=500>
</applet>
*/
