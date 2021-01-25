//access non-static data members (instance variable) within class using non-static methods
class demo
{
	int a;
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
	}
}