//access static data members (class variables) outside class using class_name
class demo
{
	static int a;		
}
class test
{
	public static void main(String ar[])
	{
		System.out.println(demo.a);
		demo.a = 90;
		System.out.println(demo.a);
	}
}