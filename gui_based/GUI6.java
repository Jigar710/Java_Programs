import java.applet.*;
import java.awt.*;

public class GUI6 extends Applet
{
	Button b1,b2,b3,b4,b5,b6;
	
	public GUI6()
	{
		b1 = new Button("first");
		b2 = new Button("sec");
		b3 = new Button("third");
		b4 = new Button("fourth");
		b5 = new Button("fifth");
		b6 = new Button("sixth");
				
		GridBagLayout grid = new GridBagLayout();
		setLayout(grid);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
	}
}

/*
<applet code=GUI6 width=300 height=200>
</applet>
*/
