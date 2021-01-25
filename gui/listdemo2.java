import java.awt.*;
import java.awt.event.*;

class listdemo2 implements ItemListener
{
	Frame frm;
	List lst;
	
	listdemo2()
	{
		frm = new Frame();
		frm.setLayout(new FlowLayout());
		
		lst = new List();
		lst.add("first");
		lst.add("sec");
		lst.add("third");
		lst.add("fourth");
		lst.add("fifth");
		
		frm.add(lst);
		
		lst.addItemListener(this);
		
		frm.setVisible(true);
		frm.setSize(300,400);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		int index = lst.getSelectedIndex();
		String name = lst.getItem(index);
		System.out.println(name);
	}
	public static void main(String ar[])
	{
		listdemo2 z = new listdemo2();
	}
}
