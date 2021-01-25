class test
{
	public static void main(String ar[])
	{
		byte a,b;
		a = 5;
		//b = (byte)(a >> 1);
		//b = (byte)(a >> 2);
		//b = (byte)(a >> 3);
		//b = (byte)(a >> 31);
		b = (byte)(a >> 32);
		System.out.println(a);
		System.out.println(b);
	}
}
/*
a = 5 : 101
b = a>>1;
2 : 010

a = 5 : 101
b = a>>2;
2 : 001

a = 5 : 101
b = a>>3;
2 : 000

once get zero in answer will get zero with large number of 
right shifting upto 31.
*/