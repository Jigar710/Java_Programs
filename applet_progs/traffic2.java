import java.awt.*;
import java.applet.*;

public class traffic2 extends Applet implements Runnable
{
	int x,y,w,h;
	Color c[] = {Color.RED,Color.black,Color.black,
				 Color.black,Color.yellow,Color.black,
				 Color.black,Color.black,Color.GREEN};
	int time[] = {9,2,6};
	int cnt,n=0;
	
	public traffic2()
	{
		cnt = 0;
		Thread t = new Thread(this);
		t.start();
	}
	public void paint(Graphics g)
	{
		x = y = 100;
		w = h = 100;
		
		g.setColor(Color.black);
		g.fillRect(x,y,w,h*3);
		
		for(int i=cnt;i<cnt+3;i++)
		{
			g.setColor(c[i]);
			g.fillOval(x,y,w,h);
			y = y + h;
		}		
	}
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(time[(n)%3]*1000);
				n++;				
			}
			catch(Exception e)
			{}
			cnt = cnt + 3;
			
			if(cnt>=c.length)
			{
				cnt = 0;
			}
			repaint();
		}
	}
}

/*
<applet code=traffic2 width=500 height=500>
</applet>
*/

