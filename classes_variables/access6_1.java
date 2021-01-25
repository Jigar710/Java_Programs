//access non-static data members (instance variables) inside class using static member functions
//error
class demo
{
	int a;		
	static void disp()
	{
		demo x = new demo();
		System.out.println(x.a);
	}
}
class test
{
	public static void main(String ar[])
	{
		demo.disp();
		
		demo d1 = new demo();
		d1.a = 90;
		d1.disp();
	}
}