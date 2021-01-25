//gridx and gridy
import java.applet.*;
import java.awt.*;

public class GUI6_1 extends Applet
{
	Button b1,b2,b3,b4,b5,b6;
	
	public GUI6_1()
	{
		b1 = new Button("first");
		b2 = new Button("sec");
		b3 = new Button("third");
		b4 = new Button("fourth");
		b5 = new Button("fifth");
		b6 = new Button("sixth");
				
		GridBagLayout grid = new GridBagLayout();
		setLayout(grid);
		
		GridBagConstraints cons = new GridBagConstraints();
			
		add(b1);
		
		cons.gridx = 1;
		cons.gridy = 1;
		add(b2,cons);		
		
		cons.gridx = 2;		
		add(b3,cons);		
		
		cons.gridy = 2;		
		add(b4,cons);		
	}
}

/*
<applet code=GUI6_1 width=300 height=200>
</applet>
*/
