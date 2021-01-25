//anchor
import java.applet.*;
import java.awt.*;

public class GUI6_4 extends Applet
{
	Button b1,b2,b3,b4,b5;
	
	public GUI6_4()
	{
		b1 = new Button("first");
		b2 = new Button("sec");
		b3 = new Button("third");
		b4 = new Button("fourth");
		b5 = new Button("fifth");
				
		GridBagLayout grid = new GridBagLayout();
		setLayout(grid);
		
		GridBagConstraints cons = new GridBagConstraints();		
		
		add(b1);
		add(b2);		
		
		cons.gridx = 2;
		cons.gridy = 1;	
		add(b3,cons);
				
		cons.gridy = 2;
		add(b4,cons);		
		
		cons.gridx = 0;
		cons.gridy = 1;
		cons.gridwidth=2;
		cons.gridheight=2;
		//cons.anchor = GridBagConstraints.NORTH;
		cons.anchor = GridBagConstraints.EAST;
		add(b5,cons);		
	}
}

/*
<applet code=GUI6_4 width=300 height=200>
</applet>
*/
