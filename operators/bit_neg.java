class test
{
	public static void main(String ar[])
	{
		int a=-5;
		int b = ~a;
		System.out.println(a+" : "+b);
	}
}
/*
a = 0000 0000 0000 0000 0000 0000 0000 0001
b = 1111 1111 1111 1111 1111 1111 1111 1110 (2's complement)

1's : 0000 0000 0000 0000 0000 0000 0000 0001
2's : +                                     1
      ---------------------------------------
	  0000 0000 0000 0000 0000 0000 0000 0010 : -2
*/