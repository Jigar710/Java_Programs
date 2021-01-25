import java.applet.*;
import java.awt.*;

public class GUI3 extends Applet
{
	Button b1,b2,b3,b4,b5;
	public GUI3()
	{
		b1 = new Button("first");
		b2 = new Button("sec");
		b3 = new Button("third");
		b4 = new Button("fourth");
		b5 = new Button("fifth");
		
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5);
	}
}
/*
<applet code=GUI3 width=234 height=234>
</applet>
*/