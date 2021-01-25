import java.awt.*;
import java.awt.event.*;

class demo3 implements FocusListener
{
	Frame f;
	Button b1,b2,b3,b4;
	public void focusLost(FocusEvent fe)
	{
		Button temp = (Button)fe.getComponent();
		temp.setBackground(Color.white);
	}
	public void focusGained(FocusEvent fe)
	{
		Button temp = (Button)fe.getComponent();
		temp.setBackground(Color.red);
	}
	demo3()
	{
		f = new Frame();
		
		b1 = new Button("btn1");
		b2 = new Button("btn2");
		b3 = new Button("btn3");
		b4 = new Button("btn4");
		f.setLayout(new FlowLayout());
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setSize(234,345);
		f.setVisible(true);
		
		b1.addFocusListener(this);
		b2.addFocusListener(this);
		b3.addFocusListener(this);
		b4.addFocusListener(this);
	}
	public static void main(String ar[])
	{
		demo3  z = new  demo3();
	}
}