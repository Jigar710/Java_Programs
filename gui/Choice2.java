import java.awt.*;
import java.awt.event.*;

class Choice2 implements ItemListener
{
	Frame frm;
	Choice c;
	
	Choice2()
	{
		frm = new Frame();
		frm.setLayout(new FlowLayout());
		
		c = new Choice();
		
		c.add("red");
		c.add("green");
		c.add("blue");
	
		c.addItemListener(this);
	
		frm.add(c);
		
		frm.setVisible(true);
		frm.setSize(300,400);
				
		frm.setBackground(Color.RED);
	}	
	public void itemStateChanged(ItemEvent ie)
	{
		String name = c.getSelectedItem();
		if(name.equalsIgnoreCase("red"))
			frm.setBackground(Color.RED);
		else if(name.equalsIgnoreCase("green"))
			frm.setBackground(Color.GREEN);
		else if(name.equalsIgnoreCase("blue"))
			frm.setBackground(Color.BLUE);
	}
	public static void main(String ar[])
	{
		Choice2 z = new Choice2();
	}
}
