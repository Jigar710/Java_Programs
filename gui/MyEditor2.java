//checkbox menu item
import java.awt.*;
import java.awt.event.*;
class MyEditor2 implements ActionListener,ItemListener
{
	Frame f;
	TextArea tx;
	MyEditor2()
	{
		frameinit();
		
		tx = new TextArea();
		f.add(tx);
		
		MenuBar mb = new MenuBar();
		mb.add(fileMenu());
		mb.add(editMenu());
		mb.add(viewMenu());
		mb.add(formatMenu());
		
		f.setMenuBar(mb);
	}
	Menu fileMenu()
	{		
		Menu m = new Menu("File");
		
		MenuItem mb1 = new MenuItem("New");
		MenuItem mb2 = new MenuItem("open");
		MenuItem mb3 = new MenuItem("save");
		MenuItem mb4 = new MenuItem("exit");
		
		m.add(mb1);
		m.add(mb2);
		m.add(mb3);
		m.add(mb4);
		
		mb1.addActionListener(this);
		mb2.addActionListener(this);
		mb3.addActionListener(this);
		mb4.addActionListener(this);
		
		return m;
	}
	Menu editMenu()
	{
		Menu m = new Menu("Edit");
		
		MenuItem mb1 = new MenuItem("cut");
		MenuItem mb2 = new MenuItem("copy");
		MenuItem mb3 = new MenuItem("paste");
		MenuItem mb4 = new MenuItem("delete");
		
		m.add(mb1);
		m.add(mb2);
		m.add(mb3);
		m.add(mb4);
		
		mb1.addActionListener(this);
		mb2.addActionListener(this);
		mb3.addActionListener(this);
		mb4.addActionListener(this);
		
		return m;
	}
	Menu viewMenu()
	{
		Menu m = new Menu("view");

		/*MenuItem mb1 = new MenuItem("Foreground");
		MenuItem mb2 = new MenuItem("background");

		m.add(mb1);
		m.add(mb2);
		*/
		
		m.add(colorMenu("Foreground"));
		m.add(colorMenu("background"));
		return m;
	}
	Menu colorMenu(String name)
	{
		Menu m = new Menu(name);
		
		MenuItem c1 = new MenuItem("red");
		MenuItem c2 = new MenuItem("green");
		MenuItem c3 = new MenuItem("blue");
		
		m.add(c1);
		m.add(c2);
		m.add(c3);
		
		return m;
	}
	
	Menu formatMenu()
	{
		Menu m = new Menu("Format");
		
		MenuItem mb1 = new MenuItem("Font");
		//MenuItem mb2 = new MenuItem("word wrap");
		CheckboxMenuItem mb2 = new CheckboxMenuItem("word wrap");
		
		m.add(mb1);
		m.add(mb2);
		
		mb1.addActionListener(this);
		mb2.addItemListener(this);
		//mb2.addActionListener(this);	can not work with checkbox menuitem
		
		return m;
	}		
	void frameinit()
	{
		f = new Frame();
		f.setVisible(true);
		f.setSize(400,400);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}	
	public static void main(String ar[])
	{
		MyEditor2 e = new MyEditor2();
	}
	public void actionPerformed(ActionEvent ae)
	{
		String temp = ae.getActionCommand();	
		if(temp.equalsIgnoreCase("new"))
			tx.setText("");
		else if(temp.equalsIgnoreCase("exit"))
			System.exit(0);
		System.out.println(temp);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		CheckboxMenuItem temp = (CheckboxMenuItem)ie.getSource();
		//System.out.println("word wrap"+temp);
		System.out.println(temp.getLabel()+" : "+temp.getState());
	}
}