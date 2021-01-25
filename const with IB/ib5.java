class demo
{
	{
		System.out.println("ib-1");
	}
	demo()
	{
		System.out.println("def");
	}
	demo(int a)
	{
		System.out.println("para 1");
	}
	demo(int a,String b)
	{
		System.out.println("para 2");
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
		demo d2 = new demo(1,"hi");
		demo d3 = new demo(100);
	}
}