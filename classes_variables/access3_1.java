//access non-static data members (instance variables) outside class using object
class demo
{
	int a;		
}
class test
{
	public static void main(String ar[])
	{
		demo d1 = new demo();
		System.out.println(d1.a);
		
		d1.a = 90;
		System.out.println(d1.a);

		demo d2 = new demo();
		System.out.println(d2.a);
	}
}