class test
{
	public static void main(String ar[])
	{
		int a = 10,b;
		int c = 10,d;
		b = a++; //==> b = a, a++
		d = ++c; // ==> ++c,d=c
		System.out.println(a + " : "+b);
		System.out.println(c + " : "+d);
	}
}
		