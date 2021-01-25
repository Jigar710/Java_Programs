class demo
{
	demo(String a)
	{
		System.out.println(a);
	}
}
class test
{
	public static void main(String ar[])
	{
		demo d[] = {new demo("first"),new demo("sec"),new demo("thrid")};
		System.out.println(d.length);
	}
}