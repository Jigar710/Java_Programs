//bit-wise shift right with zero fill
class test
{
	public static void main(String ar[])
	{
		byte a,b;
		a = 5;
		//b = (byte)(a >>> 1);
		//b = (byte)(a >>> 2);
		//b = (byte)(a >>> 3);
		b = (byte)(a >>> 6);
		//b = (byte)(a >>> 10);
		System.out.println(a);
		System.out.println(b);
	}
}