//access static data members (class variables) outside class using class_name & object
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
		demo d1 = new demo();
		System.out.println(d1.a);
	}
}