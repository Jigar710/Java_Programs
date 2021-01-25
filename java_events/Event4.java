import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Event4 extends Applet implements MouseListener
{
	public Event4()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		setBackground(Color.RED);
	}
	public void mouseExited(MouseEvent me)
	{
		setBackground(Color.YELLOW);
	}
}

/*
<applet code="Event4" width=234 height=234>
</applet>
*/