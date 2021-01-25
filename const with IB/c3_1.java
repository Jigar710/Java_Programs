class demo
{
	int a;
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