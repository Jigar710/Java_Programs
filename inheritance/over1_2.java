//single inheritance
//method overriding : same method prototype in both super and sub class
class First
{
	void disp()
	{
		System.out.println("First");
	}
}
class Second extends First
{
	void disp()
	{
		System.out.println("sec");
	}
	void show()
	{
		super.disp();
	}
}
class test
{
	public static void main(String ar[])
	{
		Second s = new Second();
		s.disp();
		s.show();
		
		First f = new First();
		f.disp();
	}
}