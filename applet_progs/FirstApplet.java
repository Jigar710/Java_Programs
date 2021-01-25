import java.applet.*;
import java.awt.*;
public class FirstApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(10,100,90,100);
	}
}
/*
<applet code=FirstApplet width=234 height=234>
</applet>
*/