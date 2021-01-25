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
	void add(time x,time y)
	{
		y.h=h+x.h;
		y.m=m+x.m;
		y.s=s+x.s;
	}
}
class test
{
	public static void main(String ar[])
	{
		time t1 = new time();
		time t2 = new time();
		time t3 = new time();
		t1.get();
		t2.get();
		t1.add(t2,t3);
		t3.disp();
	}
}

/*WAP to get one object data 

t1 - h,m,s - overall Second
	 1,2,50 - 3600 + 120 + 50 - 3870
	 

WAP to get two object data 

t1 - h,m,s - overall Second
	 1,2,50 - 3600 + 120 + 50 - 3870
t2 - h,m,s - overall Second
	 1,2,50 - 3600 + 120 + 50 - 3870
	 
display the data having maxx overall sec

WAP to get two object data 

t1 - h,m,s - overall Second
	 1,2,50 - 3600 + 120 + 50 - 3870
t2 - h,m,s - overall Second
	 1,2,50 - 3600 + 120 + 50 - 3870
	
copy into another  the data having maxx overall sec
*/






