class test
{
	public static void main(String ar[])
	{
		byte a,b;
		a = -5;
		b = (byte)(a >> 2);
		//b = (byte)(a >> 3);
		//b = (byte)(a >> 31);
		//b = (byte)(a >> 32);
		System.out.println(a);
		System.out.println(b);
	}
}
/*
a = -5/2 = -3/2 = -2

a = 5 : 0000 0000 0000 0000 0000 0000 0000 0101
1's comp : 1111 1111 1111 1111 1111 1111 1111 1010
		 : +									 1	 
2's comp : 1111 1111 1111 1111 1111 1111 1111 1011 (a = -5)

b = a>>2;
2's comp : 1111 1111 1111 1111 1111 1111 1111 1110
1's comp : 0000 0000 0000 0000 0000 0000 0000 0001
		 : +									 1	 
2's comp : 0000 0000 0000 0000 0000 0000 0000 0010
==> -2
*/