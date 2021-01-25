import java.awt.*;
import java.awt.event.*;

public class TicTacTeo implements ActionListener
{
	Frame f;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	GridLayout gd;
	String msg="X";
	
	void init()
	{
		f = new Frame();
		
		b1 = new Button();
		b2 = new Button();
		b3 = new Button();
		
		b4 = new Button();
		b5 = new Button();
		b6 = new Button();
		
		b7 = new Button();
		b8 = new Button();
		b9 = new Button();
		
		gd = new GridLayout(3,3,2,2);
		
		f.setLayout(gd);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.add(b4);
		f.add(b5);
		f.add(b6);
		
		f.add(b7);
		f.add(b8);
		f.add(b9);
		
		f.setVisible(true);
		f.setSize(300,300);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	void deregister()
	{
		b1.removeActionListener(this);
		b2.removeActionListener(this);
		b3.removeActionListener(this);
		
		b4.removeActionListener(this);
		b5.removeActionListener(this);
		b6.removeActionListener(this);
		
		b7.removeActionListener(this);
		b8.removeActionListener(this);
		b9.removeActionListener(this);
	}
	void register()
	{
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Button temp = (Button)ae.getSource();
		temp.setLabel(msg);
		temp.removeActionListener(this);
				
		if(msg.equals("X"))
			msg = "O";
		else
			msg = "X";
		
		boolean status = check();
		if(status == true)
		{
			deregister();
			
			if(msg.equals("O"))
				System.out.println("First Player won!!!");	
			else
				System.out.println("Second Player won!!!");	
		}		
	}
	public TicTacTeo()
	{
		init();
		register();
	}
	public static void main(String ar[])
	{
		TicTacTeo t = new TicTacTeo();
	}
	boolean check()
	{
		//rows
		if(b1.getLabel().equals("")==false && b1.getLabel().equals(b2.getLabel()) && b1.getLabel().equals(b3.getLabel()))
			return true;
		if(b4.getLabel().equals("")==false && b4.getLabel().equals(b5.getLabel()) && b4.getLabel().equals(b6.getLabel()))
			return true;
		if(b7.getLabel().equals("")==false && b7.getLabel().equals(b8.getLabel()) && b7.getLabel().equals(b9.getLabel()))
			return true;
		
		//columns
		if(b1.getLabel().equals("")==false && b1.getLabel().equals(b4.getLabel()) && b1.getLabel().equals(b7.getLabel()))
			return true;
		if(b2.getLabel().equals("")==false && b2.getLabel().equals(b5.getLabel()) && b2.getLabel().equals(b8.getLabel()))
			return true;
		if(b3.getLabel().equals("")==false && b3.getLabel().equals(b6.getLabel()) && b3.getLabel().equals(b9.getLabel()))
			return true;
		
		//upper diagonal		
		if(b1.getLabel().equals("")==false && b1.getLabel().equals(b5.getLabel()) && b1.getLabel().equals(b9.getLabel()))
			return true;
		
		//lower diagonal
		if(b3.getLabel().equals("")==false && b3.getLabel().equals(b5.getLabel()) && b3.getLabel().equals(b7.getLabel()))
			return true;
				
		return false;
	}
}
	