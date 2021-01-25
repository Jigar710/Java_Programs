//access static data members (class variables) inside class using static member functions
class demo
{
	static int a;		
	static void disp()
	{
		System.out.println(a);
	}
}
class test
{
	public static void main(String ar[])
	{
		demo.disp();
		
		demo.a = 100;
		
		demo d1 = new demo();
		d1.disp();
	}
}