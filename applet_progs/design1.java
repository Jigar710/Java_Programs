import java.awt.*;
import java.applet.*;

public class design1 extends Applet
{
	int x,y,w=100,h=100;
	int screen_width,screen_height;
	public void paint(Graphics g)
	{
		h = w = 100;
		screen_height = getHeight();
		screen_width = getWidth();
		//System.out.println(screen_height+" : "+screen_width);
		
		for(int i=1;i<=5;i++)
		{
			x = (screen_width-w)/2;
			y = (screen_height-h)/2;
		
			g.drawOval(x,y,w,h);
			w+=50;
			h+=50;
			
		}
	}
}
/*
<applet code=design1 width=500 height=500>
</applet>
*/