import java.awt.*;
import java.awt.event.*;

class Choice3 implements ItemListener
{
	Frame frm;
	Choice c;
	TextArea lbl;
	Panel p,p1;
	
	Choice3()
	{
		frm = new Frame();
		
		p = new Panel();
		p1 = new Panel();
				
		c = new Choice();
		lbl = new TextArea();
		lbl.setEditable(false);
		
		for(int i=1;i<=10;i++)
		{
			c.add(""+i);
		}
		
		c.addItemListener(this);
	
		p.add(c);
		p1.add(lbl);
		frm.add(p,BorderLayout.NORTH);
		frm.add(p1);//,BorderLayout.CENTER);
		
		frm.setVisible(true);
		frm.pack();
				
		disp(0);	
	}	
	public void itemStateChanged(ItemEvent ie)
	{		
		int index = c.getSelectedIndex();
		disp(index);
	}
	void disp(int index)
	{
		String ans="";		
		for(int i=1;i<=10;i++)
		{
			ans = ans + (index+1) + " * "+ i +" = "+((index+1)*i) + "\n";
		}
		lbl.setText(ans);
	}
	public static void main(String ar[])
	{
		Choice3 z = new Choice3();
	}
}
