class test
{
	public static void main(String ar[])
	{
		char a='a';
		char b = 'b';
		//char c = a + b;
		char c = (char)(a + b);
		System.out.println(c);
		char d = (char)(a + 1);
		System.out.println(d);
		
		System.out.println(b - 1);
		System.out.println((char)(b - 1));
		
		System.out.println(b * 1);
		System.out.println(b * a);
	}
}