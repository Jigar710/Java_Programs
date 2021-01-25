//IB : initialization block
class demo
{
	{
		System.out.println("ib-1");
	}
	demo()
	{
		System.out.println("A");
	}
}
class test
{
	public static void main(String ar[])
	{
		demo d1 = new demo();
	}
}