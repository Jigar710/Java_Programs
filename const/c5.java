class demo
{
	demo()
	{
		System.out.println("def");
	}
}
class test
{
	public static void main(String ar[])
	{
		demo d[] = {new demo(),new demo(),new demo()};
		System.out.println(d.length);
	}
}