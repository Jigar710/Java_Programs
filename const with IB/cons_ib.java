class demo
{
	demo(int a)
	{
		System.out.println("para");
	}
	demo()
	{
		this(10);
		System.out.println("def");
	}
	{
		System.out.println("ib-1");
	}
	{
		System.out.println("ib-2");
	}
}
class test
{
	public static void main(String ar[])
	{
		demo d1 = new demo();
		demo d2 = new demo(100);
	}
}