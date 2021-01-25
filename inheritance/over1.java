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
}
class test
{
	public static void main(String ar[])
	{
		Second s = new Second();
		s.disp();
		
		First f = new First();
		f.disp();
	}
}