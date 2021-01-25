import java.awt.*;
import java.awt.event.*;

public class MyWin implements WindowListener
{
	Frame f;
	public MyWin()
	{
		f = new Frame();
		f.setTitle("My window");
		f.setVisible(true);
		f.setSize(300,400);
		
		f.addWindowListener(this);
	}
	public static void main(String ar[])
	{
		MyWin m = new MyWin();
	}
	public void windowOpened(WindowEvent we)
	{
		System.out.println("opened");
	}
	public void windowClosed(WindowEvent we)
	{
		System.out.println("closed");
	}
	public void windowIconified(WindowEvent we)
	{
		System.out.println("minimized");
	}
	public void windowDeiconified(WindowEvent we)
	{
		System.out.println("restored");
	}
	public void windowClosing(WindowEvent we)
	{
		System.out.println("closing");
		System.exit(0);
	}
	public void windowActivated(WindowEvent we)
	{
		System.out.println("activated");
	}
	public void windowDeactivated(WindowEvent we)
	{
		System.out.println("de activated");
	}
}