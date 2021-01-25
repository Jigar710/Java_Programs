class test
{
	public static void main(String ar[])
	{
		byte a,b;
		a = 25;
		//b = (byte)(a << 3);
		//b = (byte)(a << 4);
		//b = (byte)(a << 5);
		//b = (byte)(a << 6);
		//b = (byte)(a << 7);
		//b = (byte)(a << 8);
		//b = (byte)(a << 10);
		//b = (byte)(a << 20);
		//b = (byte)(a << 30);
		//b = (byte)(a << 31);
		//b = (byte)(a << 32);
		//b = (byte)(a << 33);
		//b = (byte)(a << 64);
		b = (byte)(a << 66);
		
		System.out.println(a);
		System.out.println(b);
	}
}