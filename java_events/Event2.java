import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Event2 extends Applet implements ActionListener
{
	Button b1,b2;
	public Event2()
	{
		b1 = new Button("hi");
		b2 = new Button("bye");
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String name = ae.getActionCommand();
		System.out.println(name);
	}
}
/*
<applet code="Event2" width=234 height=234>
</applet>
*/