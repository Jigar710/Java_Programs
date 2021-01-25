//this() : use to invoke a const from a const
//must be a first statement
//recursive call not allowed for const : directly or indirectly
class demo
{
	demo(int a)
	{
		System.out.println("para");
	}
	demo()
	{
		this(10);
		//demo(10);
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