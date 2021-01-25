//bit-wise shift right with zero fill
class test
{
	public static void main(String ar[])
	{
		int a,b;
		a = -5;
		b = a>>>24;
		System.out.println(a);
		System.out.println(b);
	}
}
/*
a = -5
a = 5 : 0000 0000 0000 0000 0000 0000 0000 0101
1's comp : 1111 1111 1111 1111 1111 1111 1111 1010
		 : +									 1	 
2's comp : 1111 1111 1111 1111 1111 1111 1111 1011 (a = -5)

b = a >>> 24;
b        : 0000 0000 0000 0000 0000 0000 1111 1111
*/