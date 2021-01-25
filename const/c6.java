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
		demo d1 = new demo();
		demo d2 = new demo();
		demo d3 = new demo();
		
		demo d[] = {d1,d2,d3};
		System.out.println(d.length);
	}
}