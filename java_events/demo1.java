import java.awt.*;
import java.awt.event.*;

class demo1 implements FocusListener
{
	Frame f;
	TextField t1,t2;
	public void focusLost(FocusEvent fe)
	{
		String a = t1.getText();
		t2.setText(a);
	}
	public void focusGained(FocusEvent fe)
	{}
	demo1()
	{
		f = new Frame();
		t1 = new TextField(20);
		t2 = new TextField(20);
		
		f.setLayout(new FlowLayout());
		
		f.add(t1);
		f.add(t2);
		
		f.setSize(234,345);
		f.setVisible(true);
		
		t1.addFocusListener(this);
	}
	public static void main(String ar[])
	{
		demo1 z = new demo1();
	}
}