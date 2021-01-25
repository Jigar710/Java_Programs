import java.util.*;
class first
{
	private int a;
	
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		a=sc.nextInt();
	}
	void disp()
	{
		System.out.println("Welcome to First "+a);
	}
}
class test
{
	public static void main(String ar[])
	{
		first f = new first();
		f.get();
		f.disp();
	}
}