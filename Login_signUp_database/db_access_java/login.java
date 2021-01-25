import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;

class login implements ActionListener
{
	TextField t1,t2;
	Button b1,b2,b3;
	Frame f;
	Label l1,l2,l3;
	GridBagLayout gd;
	GridBagConstraints gc;
	
	login()
	{
		l1 = new Label("Name");
		l2 = new Label("Password");
		l3 = new Label("",Label.CENTER);
		
		t1 = new TextField(10);
		t2 = new TextField(10);
		t2.setEchoChar('*');
		
		b1 = new Button("Login");
		b2 = new Button("reset");
		b3 = new Button("signup");
		
		gd = new GridBagLayout();
		gc = new GridBagConstraints();
		
		f = new Frame("Login Screen");
		
		f.setLayout(gd);
//	<-- First line -->		
		gc.gridx = 0;
		gc.gridy = 0;
		f.add(l1,gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		f.add(t1,gc);

//	<-- Second line -->				
		gc.gridx = 0;
		gc.gridy = 1;
		f.add(l2,gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		f.add(t2,gc);

//	<-- Third line -->		
		gc.gridx = 0;
		gc.gridy = 2;
		f.add(b1,gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		f.add(b2,gc);
	
		gc.gridx = 1;
		gc.gridy = 3;
		f.add(b3,gc);
	
//	<-- Fourth line -->		
		gc.gridx = 0;
		gc.gridy = 4;
		gc.gridwidth = 2;
		gc.fill = GridBagConstraints.BOTH;
		f.add(l3,gc);
		
			
		f.setVisible(true);
		f.setSize(400,400);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		String name = ae.getActionCommand();//return the name of the Button on which we clicked
		if(name.equals("signup"))
		{
			f.setVisible(false);
			new signUp();
		}
		else if(name.equals("Login"))
		{
			String a = t1.getText();
			String b = t2.getText();
			
			boolean ans = checkDatabase(a,b);
			if(ans == true)
			{
				l3.setText("Login done!!!");
				l3.setForeground(Color.BLUE);
			}
			else
			{
				l3.setText("id and pssword does not match");
				l3.setForeground(Color.RED);
			}	
		}
		else
		{
			t1.setText("");
			t2.setText("");
			l3.setText("");
		}
	}
	Connection con;
	Statement st;
	ResultSet rs;
	String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	String url = "jdbc:odbc:Database_login";
	String q;
	Scanner sc = new Scanner(System.in);
	
	void dbconnect()
	{
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url);
			st = con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	boolean checkDatabase(String name,String pass)
	{
		
		q = "select * from emp where fname = '"+name+"' and password = '"+pass+"'";
		System.out.println(q);
		try{
			dbconnect();
			rs = st.executeQuery(q);
						
			if(rs.next() == true)
			{
				rs.close();
				st.close();
				con.close();
				return true;
			}
			else
			{
				rs.close();
				st.close();
				con.close();
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
class signUp implements ActionListener
{
	TextField t1,t2,t3;
	Button b1,b2,b3;
	Frame f;
	Label l1,l2,l3;
	GridBagLayout gd;
	GridBagConstraints gc;
	
	Connection con;
	Statement st;
	ResultSet rs;
	String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	String url = "jdbc:odbc:Database_login";
	String q;
	Scanner sc = new Scanner(System.in);
	
	void dbconnect()
	{
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url);
			st = con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	signUp()
	{
		l1 = new Label("Name");
		l2 = new Label("Password");
		l3 = new Label("Mobile");
		
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t2.setEchoChar('*');
		
		b1 = new Button("submit");
		b2 = new Button("reset");
		b3 = new Button("login");
				
		gd = new GridBagLayout();
		gc = new GridBagConstraints();
		
		f = new Frame("Login Screen");
		
		f.setLayout(gd);
//	<-- First line -->		
		gc.gridx = 0;
		gc.gridy = 0;
		f.add(l1,gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		f.add(t1,gc);

//	<-- Second line -->				
		gc.gridx = 0;
		gc.gridy = 1;
		f.add(l2,gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		f.add(t2,gc);

//	<-- Third line -->				
		gc.gridx = 0;
		gc.gridy = 2;
		f.add(l3,gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		f.add(t3,gc);

//	<-- Fourth line -->		
		gc.gridx = 0;
		gc.gridy = 3;
		f.add(b1,gc);
		
		gc.gridx = 1;
		gc.gridy = 3;
		f.add(b2,gc);
		
//	<-- Fifth line -->			
		gc.gridx = 1;
		gc.gridy = 4;
		f.add(b3,gc);
				
		f.setVisible(true);
		f.setSize(400,400);
		f.setSize(400,400);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		String name = ae.getActionCommand();//return the name of the Button on which we clicked
		if(name.equals("login"))
		{
			f.setVisible(false);
			new login();
		}
		else if(name.equals("submit"))
		{
			String a = t1.getText();
			String b = t2.getText();
			String c = t3.getText();
	

			q = "insert into emp values ('"+a+"','"+b+"',"+c+")";
			System.out.println(q);
		try{
		dbconnect();
		int n = st.executeUpdate(q);
		System.out.println(n+" records inserted ...");
		
			f.setVisible(false);
			new login();
		st.close();
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		else
		{
			t1.setText("");
			t2.setText("");
		}
	}
}

class demo
{
	
	public static void main(String ar[])
	{
		login z = new login();
	}
}