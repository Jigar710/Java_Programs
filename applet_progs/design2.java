import java.awt.*;
import java.applet.*;

public class design2 extends Applet implements Runnable
{
	int x,y,w=100,h=100;
	int screen_width,screen_height;
	int cnt=1;
	
	public design2()
	{
		Thread t = new Thread(this);
		t.start();
	}
	public void paint(Graphics g)
	{
		h = w = 100;
		screen_height = getHeight();
		screen_width = getWidth();
		//System.out.println(screen_height+" : "+screen_width);
		
		for(int i=1;i<=cnt;i++)
		{
			x = (screen_width-w)/2;
			y = (screen_height-h)/2;
		
			g.drawOval(x,y,w,h);
			w+=50;
			h+=50;			
		}
	}
	@Override	
	public void run()
	{
		while(true)
		{
			try{
			Thread.sleep(1000);
			}
			catch(Exception e)
 			{}
			cnt++;
			System.out.println(cnt);
			repaint();
		}
	}
}
/*
<applet code=design2 width=500 height=500>
</applet>
*/