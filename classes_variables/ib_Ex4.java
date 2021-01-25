//static and non-static ibs
class demo
{
	static 
	{	
		System.out.println("static ib-1");
	}	
	{	
		System.out.println("normal ib-1");
	}
	{	
		System.out.println("normal ib-2");
	}
	static 
	{	
		System.out.println("static ib-2");
	}
	demo()
	{
		System.out.println("def");
	}
	demo(int a)
	{
		System.out.println("para");
	}
}
class test
{
	public static void main(String ar[])
	{
		demo d1,d2,d3;
		d1 = new demo();
		d2 = new demo(10);
		d3 = new demo();
	}
}