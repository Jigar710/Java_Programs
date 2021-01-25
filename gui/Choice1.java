import java.awt.*;

class Choice1 
{
	Frame frm;
	Choice c;
	
	Choice1()
	{
		frm = new Frame();
		frm.setLayout(new FlowLayout());
		
		c = new Choice();
		
		c.add("first");
		c.add("sec");
		c.add("third");
		c.add("fourth");
		c.add("fifth");
		
		frm.add(c);
		
		frm.setVisible(true);
		frm.setSize(300,400);
	}	
	public static void main(String ar[])
	{
		Choice1 z = new Choice1();
	}
}
