//instance variable : non static data members
class demo
{
	int a;	
	{
		System.out.println("A");
	}
}
class test
{
	public static void main(String ar[])
	{
		demo d1,d2,d3;
		d1 = new demo();
		d2 = new demo();
		d3 = new demo();

		d1.a = 10;
		System.out.println(d2.a);
		System.out.println(d3.a);
	}
}
	