import java.awt.*;
import java.awt.event.*;

class calc1 implements ActionListener
{
	Frame f;
	Button b1,b2,b3,b4;
	TextField t1,t2;
	Label l1;
	Font fnt;
	Button prv = null;	
	
	calc1()
	{
		f = new Frame();
		
		b1 = new Button("+");
		b2 = new Button("-");
		b3 = new Button("*");
		b4 = new Button("/");
		
		t1 = new TextField(20);
		t2 = new TextField(20);
		
		l1 = new Label("Ans : ");
		
		fnt = new Font("times new roman",Font.BOLD,25);
		
		f.setFont(fnt);
		
		f.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.gridwidth = 4;
		gc.fill = gc.BOTH;
		
		gc.gridx = 0;
		gc.gridy = 0;		
		f.add(t1,gc);
		
		gc.gridy = 1;		
		f.add(t2,gc);
		
		gc.gridy = 2;		
		f.add(l1,gc);
		
		gc.gridwidth = 1;
		
		gc.gridx = 0;
		gc.gridy = 3;
		gc.weightx = 0.25;
		f.add(b1,gc);
		
		gc.gridx = 1;
		f.add(b2,gc);
		
		gc.gridx = 2;		
		f.add(b3,gc);
		
		gc.gridx = 3;		
		f.add(b4,gc);
		
		f.pack();			
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setVisible(true);	

		b1.addActionListener(this);		
		b2.addActionListener(this);		
		b3.addActionListener(this);		
		b4.addActionListener(this);		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String a = t1.getText();
		String b = t2.getText();
		
		try{
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);
			
			String action = ae.getActionCommand();
			
			if(prv != null)
			{
				prv.setBackground(Color.white);
			}
			Button temp = (Button)ae.getSource();
			temp.setBackground(Color.red);
			prv = temp;
			
			if(action.equals("+"))
			{
				l1.setText("Ans : "+(x+y));
			}
			else if(action.equals("-"))
			{
				l1.setText("Ans : "+(x-y));
			}			
			else if(action.equals("*"))
			{
				l1.setText("Ans : "+(x*y));
			}			
			else if(action.equals("/"))
			{
				l1.setText("Ans : "+((float)x/y));
			}			
			l1.setForeground(Color.blue);
		}	
		catch(Exception e)
		{
			l1.setText("invalid data");
			l1.setForeground(Color.red);
		}
		
	}
	public static void main(String ar[])
	{
		calc1 z = new  calc1();
	}

}