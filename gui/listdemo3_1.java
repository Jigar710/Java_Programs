import java.awt.*;
import java.awt.event.*;

class listdemo3_1 implements ActionListener,ItemListener
{
	Frame frm;
	List lst1,lst2;
	Button b1,b2;
	
	listdemo3_1()
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
	
		lst2.addItemListener(this);
		
		frm.setVisible(true);
		//frm.setSize(300,400);
		frm.pack();
		
		frm.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		b2.setEnabled(false);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Button temp = (Button)ae.getSource();
		if(temp==b1)
		{
			String name = lst1.getItem(lst1.getSelectedIndex());
			lst2.add(name);
		}
		else
		{
			int index = lst2.getSelectedIndex();
			lst2.remove(index);
			b2.setEnabled(false);
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{
		b2.setEnabled(true);
	}
	public static void main(String ar[])
	{
		listdemo3_1 z = new listdemo3_1();
	}
}
