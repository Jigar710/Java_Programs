//IB : initialization block
class demo
{
	int a;
	
	{
		a = 0;
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
		System.out.println(d1.a);
	}
}