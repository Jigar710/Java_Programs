//IB : initialization block
class demo
{
	{
		System.out.println("ib-1");
	}
	{
		System.out.println("ib-2");
	}
	demo()
	{
		System.out.println("A");
	}
	{
		System.out.println("ib-3");
	}	
}
class test
{
	public static void main(String ar[])
	{
		demo d1 = new demo();
		demo d2 = new demo();
	}
}