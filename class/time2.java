import java.util.*;
class time
{
	private int h,m,s;
	
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
	void copy(time x) 	 // time x = new time();
	{
		x.h=h;
		x.m=m;
		x.s=s;
	}
}
class test
{
	public static void main(String ar[])
	{
		time t1 = new time();
		time t2 = new time();
		t1.get();
		t1.copy(t2);
		t2.disp();
	}
}




