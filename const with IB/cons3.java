class demo
{
	demo(int a)
	{
		System.out.println("para");
	}
	demo()
	{
		this();
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