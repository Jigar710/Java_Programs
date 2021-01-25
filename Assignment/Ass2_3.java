import java.awt.*;
import java.awt.event.*;

public class Ass2_3 extends Frame implements ActionListener{
	
	TextField num1,num2,num3;
	int Answer;
	Button add,sub,clear,quit;
	
	Ass2_3(){
		addWindowListener(new WindowEve());
		GridLayout grid = new GridLayout(4,2);
		setLayout(grid);
		Label n1=new Label("Number 1:");
		Label n2=new Label("Number 2:");
		
		num1= new TextField();
		num2= new TextField();
		
		add(n1);
		add(num1);
		add(n2);
		add(num2);
		
		num1.addActionListener(this);
		num2.addActionListener(this);
		
		
		add=new Button("Add");
		sub=new Button("Sub");
		clear=new Button("Clear");
		quit=new Button("Quit");
		
		add(add);
		add(sub);
		add(clear);
		add(quit);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		clear.addActionListener(this);
		quit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		String str=e.getActionCommand();
		
		if(str.equals("Add")){
			Answer=Integer.parseInt(num1.getText())+Integer.parseInt(num2.getText());
			num1.setText(num1.getText()+"+"+num2.getText()+"="+String.valueOf(Answer));
			num2.setText("");
		}
		else if(str.equals("Sub")){
			Answer=Integer.parseInt(num1.getText())-Integer.parseInt(num2.getText());
			num1.setText(num1.getText()+"-"+num2.getText()+"="+String.valueOf(Answer));
			num2.setText("");
		}
		else if(str.equals("Clear")){
			num1.setText("");
			num2.setText("");
		}
		else{
			System.exit(0);
		}
	}
	public static void main(String args[]){
		Ass2_3 f=new Ass2_3();
		f.setSize(new Dimension(400,200));
		f.setTitle("Assignment 2 program no.3");
		f.setVisible(true);
	}
}

class WindowEve extends WindowAdapter{
	public void windowClosing(WindowEvent w){
		System.exit(0);
	}
}