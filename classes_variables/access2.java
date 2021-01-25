//access static data members (class variables) within class using non-static methods
class demo
{
	static int a;
	void disp()
	{
		System.out.println(a);
	}
}
class test
{
	public static void main(String ar[])
	{
		demo d1 = new demo();
		d1.disp();
		
		d1.a = 90;
		d1.disp();

		demo d2 = new demo();
		d2.disp();  		
	}
}