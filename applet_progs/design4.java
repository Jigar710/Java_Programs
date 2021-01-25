import java.awt.*;
import java.applet.*;

public class design4 extends Applet implements Runnable
{
	int x,y,w,h;
	int screen_width,screen_height;
	int cnt=1;
	boolean flag = false;
	
	public design4()
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
			if(w>= screen_width || h>=screen_height)
			{
				flag = true;
			}
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
			if(flag==true)
			{
				cnt--;
			}
			else
			{
				cnt++;
			}
			if(cnt==1)
			{
				flag = false;
			}
			//System.out.println(cnt);
			repaint();
		}
	}
}
/*
<applet code=design4 width=500 height=500>
</applet>
*/