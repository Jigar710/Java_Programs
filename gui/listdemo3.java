import java.awt.*;
import java.awt.event.*;

class listdemo3 implements ActionListener
{
	Frame frm;
	List lst1,lst2;
	Button b1,b2;
	
	listdemo3()
	{
		frm = new Frame();
		frm.setLayout(new FlowLayout());
		
		b1 = new Button(">>");
		b2 = new Button("Del");
		
		lst1 = new List();
		lst1.add("first");
		lst1.add("sec");
		lst1.add("third");
		lst1.add("fourth");
		lst1.add("fifth");
		
		lst2 = new List();
		
		frm.add(lst1);
		frm.add(b1);
		frm.add(b2);
		frm.add(lst2);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
	
		frm.setVisible(true);
		//frm.setSize(300,400);
		frm.pack();
	}
	public void actionPerformed(ActionEvent ae)
	{
		Button temp = (Button)ae.getSource();
		try{
			if(temp==b1)
			{
				String name = lst1.getItem(lst1.getSelectedIndex());
				lst2.add(name);
			}
			else
			{
				int index = lst2.getSelectedIndex();
				lst2.remove(index);
			}
		}
		catch(Exception e)
		{}		
	}
	public static void main(String ar[])
	{
		listdemo3 z = new listdemo3();
	}
}
