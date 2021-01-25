import java.awt.*;
import java.awt.event.*;

public class MyWin1 extends WindowAdapter
{
	Frame f;
	public MyWin1()
	{
		f = new Frame();
		f.setTitle("My window");
		f.setVisible(true);
		f.setSize(300,400);
		
		f.addWindowListener(this);
	}
	public static void main(String ar[])
	{
		MyWin1 m = new MyWin1();
	}
	public void windowClosing(WindowEvent we)
	{
		System.out.println("closing");
		System.exit(0);
	}	
}