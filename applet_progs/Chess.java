import java.applet.*;
import java.awt.*;
public class Chess extends Applet
{
	int x,y,w,h;
	public void paint(Graphics g)
	{
		x=y=10;
		w=h=50;
		for(int j=1;j<=8;j++)
		{
			for(int i=1;i<=4;i++)
			{
				if(j%2==0)
				{
					g.drawRect(x,y,w,h);
					x = x + w;
					g.fillRect(x,y,w,h);
					x = x + w;
				}
				else
				{
					g.fillRect(x,y,w,h);
					x = x + w;
					g.drawRect(x,y,w,h);
					x = x + w;
				}
			}
			y = y + h;
			x = 10;
		}
	}
}
/*
<applet code=Chess width=500 height=500>
</applet>
*/