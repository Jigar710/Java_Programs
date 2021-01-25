import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Event3 extends Applet implements ActionListener
{
	Button b1,b2,b3;
	public Event3()
	{
		b1 = new Button("red");
		b2 = new Button("green");
		b3 = new Button("blue");
		
		add(b1);
		add(b2);
		add(b3);		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String a = ae.getActionCommand();//return name of component 
		if(a.equals("red"))
		{
			setBackground(Color.RED);
		}
		else if(a.equals("green"))
		{
			setBackground(Color.GREEN);
		}
		else if(a.equals("blue"))
		{
			setBackground(Color.BLUE);
		}
	}
}


/*
<applet code="Event3" width=234 height=234>
</applet>
*/