class demo
{
	demo(int a)
	{
		this();
		System.out.println("para");
	}
	demo()
	{
		this(10);
		System.out.println("def");
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