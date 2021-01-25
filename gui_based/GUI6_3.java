//fill
import java.applet.*;
import java.awt.*;

public class GUI6_3 extends Applet
{
	Button b1,b2,b3,b4,b5,b6,b7;
	
	public GUI6_3()
	{
		b1 = new Button("first");
		b2 = new Button("sec");
		b3 = new Button("third");
		b4 = new Button("fourth");
		b5 = new Button("fifth");
		b6 = new Button("sixth");
		b7 = new Button("seventh");
				
		GridBagLayout grid = new GridBagLayout();
		setLayout(grid);
		
		GridBagConstraints cons = new GridBagConstraints();
		cons.fill = GridBagConstraints.BOTH;
		
		add(b1);
		add(b2);
		add(b3,cons);
		
		cons.gridx = 0;
		cons.gridy = 1;
		cons.gridwidth=2;
		add(b4,cons);
		
		cons.gridx = 2;
		cons.gridy = 1;
		cons.gridwidth = 1;
		cons.gridheight = 2;
		add(b5,cons);
		
		cons.gridx = 0;
		cons.gridy = 2;
		cons.gridwidth = 2;
		cons.gridheight = 2;
		add(b6,cons);
				
		cons.gridx = 2;
		cons.gridy = 3;
		cons.gridwidth = 1;
		cons.gridheight = 1;
		add(b7,cons);
		
	}
}

/*
<applet code=GUI6_3 width=300 height=200>
</applet>
*/
