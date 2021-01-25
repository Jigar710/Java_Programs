import java.applet.*;
import java.awt.*;

public class GUI4 extends Applet
{
	Button b1,b2,b3;
	public GUI4()
	{
		b1 = new Button("first");
		b2 = new Button("sec");
		b3 = new Button("third");
		
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		
		Panel p = new Panel();
		//FlowLayout layout1 = new FlowLayout(FlowLayout.LEFT);
		FlowLayout layout1 = new FlowLayout(FlowLayout.LEFT,100,20);
		p.setLayout(layout1);
				
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		//add(p,BorderLayout.NORTH);
		add(p,BorderLayout.SOUTH);
	}
}
/*
<applet code=GUI4 width=234 height=234>
</applet>
*/