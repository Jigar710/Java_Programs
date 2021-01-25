class test
{
	public static void main(String ar[])
	{
		int a = 10,c;
		//c = ++a + ++a;
		//c = ++a + a++;
		//c = a++ + ++a;
		c = a++ + a++;
		System.out.println(a + " : "+c);
	}
}
	
/*
c = ++a + ++a;
++a
++a
c = a + a
*/	