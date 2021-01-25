import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Event5 extends Applet implements MouseListener
{
	Button b1,b2,b3;
	public Event5()
	{
		b1 = new Button("red");
		b2 = new Button("green");
		b3 = new Button("blue");
		
		add(b1);
		add(b2);
		add(b3);	

		b1.addMouseListener(this);
		b2.addMouseListener(this);
		b3.addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		Button temp = (Button)me.getSource();
		Font font = new Font("times new roman",Font.BOLD,16);
		if(temp==b1)
			b1.setFont(font);
		else if(temp==b2)
			b2.setFont(font);
		else if(b3==temp)
			b3.setFont(font);
	}
	public void mouseExited(MouseEvent me)
	{
		Button temp = (Button)me.getSource();
		Font font = new Font("times new roman",Font.PLAIN,12);
		if(temp==b1)
			b1.setFont(font);
		else if(temp==b2)
			b2.setFont(font);
		else if(b3==temp)
			b3.setFont(font);
	}
}

/*
<applet code="Event5" width=234 height=234>
</applet>
*/