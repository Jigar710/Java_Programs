class emp
{
	int id;
	String name;
	int sal;
	
	emp()
	{
		System.out.println("create : deafult");
	}
	emp(int x,String n)
	{
		id=x;
		name=n;
	}
	emp(int x,String n,int y)
	{
		id=x;
		name=n;
		sal = y;	
	}
	void disp()
	{
		System.out.println(id+" : "+name+" : "+sal);
	}
	
}
class test
{
	public static void main(String ar[])
	{
		emp e1 = new emp(101,"AAA",10000);
		e1.disp();
		emp e2 = new emp(102,"BBB");
		e2.disp();
	}
}





