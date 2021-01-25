import java.util.Scanner;
class node{
	int data;
	node next;
	node head=null;
	node tail=null;
	node(){
	next=null;
	}
	node(int d){
	data=d;
	next=null;
	}
	node(int d,node n){
	data=d;
	next=n;
	}
	node(node n){
	next=n;
	}
	void display(node n){
		node temp=head;
		System.out.println("your linked list is:");
		while(temp.next!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	void insert(int d,node new_n){
		node temp=head;
		while(temp.data!=d){
			temp=temp.next;
		}
		new_n.next=temp.next;
		temp.next=new_n;
		System.out.println("Data inserted sucessfully");
	}
	void delete(int d){
		node temp=head;
		if(head==null){
			System.out.println("No elements to delete.");
		}
		else if(head.next==null && head.data==d){
			head=null;
			System.out.println("Data Deleted sucessfully");
		}
		else if(head.data==d){
			head=temp.next;
			System.out.println("Data Deleted sucessfully");
		}
		else{
			while(temp.next.data!=d){
				temp=temp.next;
		}
		temp.next=temp.next.next;
		System.out.println("Data Deleted sucessfully");
		}
	}
	void search(int pos){
		int i=0;
		node temp=head;
		while(pos!=i){
			i++;
			if(pos==i){
				System.out.println("At "+pos+"th position:");
				System.out.println(temp.data);
		}
		temp=temp.next;
		}
	}
	void append(node n){
		node temp=this;
		if(head==null){
			head=this;
			this.next=n;
			n.next=null;
		}
		else{
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=n;
		}
	}
}
class Ass1_3{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
node n1=new node(1);
node n2=new node(2);
node n3=new node(3);
node n4=new node(4);
n1.append(n2);
n1.append(n3);
n1.append(n4);
char c;
do{
	System.out.println("\n1.Insert\n2.Delete\n3.Append\n4.Display\n5.Search");
	System.out.println("Enter your chice:");
	int ch=in.nextInt();
	if(ch==1){
		System.out.println("After which value:");
		int d=in.nextInt();
		System.out.println("Enter data that you want to insert:");
		int n_d=in.nextInt();
		node new_n=new node(n_d);
		n1.insert(d,new_n);
	}
	else if(ch==2){
		System.out.println("Which value you want to delete:");
		int d=in.nextInt();
		n1.delete(d);
	}
	else if(ch==3){
		System.out.println("Enter your new node data:");
		int d=in.nextInt();
		node new_n=new node(d);
		n1.append(new_n);
	}
	else if(ch==4){
		n1.display(n1);
	}
	else if(ch==5){
		System.out.println("Enter position:");
		int pos=in.nextInt();
		n1.search(pos);
	}
	else{
		System.out.println("Invalid input..");
	}
	System.out.println("Do you want to continue(y/n)");
	c=in.next().charAt(0);
}while(c=='y');
}
}
