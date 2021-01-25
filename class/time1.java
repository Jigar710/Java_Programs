/*WAP a program to create a time class having hour min, sec as a data member 
and define get and disp() methode*/
import java.util.*;
class time
{
	int h,m,s;
	
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter h : ");
		h=sc.nextInt();
		System.out.print("Enter m : ");
		m=sc.nextInt();
		System.out.print("Enter s : ");
		s=sc.nextInt();
	}
	void disp()
	{
		System.out.println(h+" : "+m+" : "+s);
	}
}
class test
{
	public static void main(String ar[])
	{
		time t1=new time();
		time t2=new time();
		t1.get();
		t1.disp();
		
		t2.get();
		t2.disp();
	}
}

