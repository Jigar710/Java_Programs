class test
{
	public static void main(String ar[])
	{
		int a,b;
		//a = 4;
		//a = 5;
		a = 32000000;
		b = a << 10;
		System.out.println(a);
		System.out.println(b);
	}
}
/*
a : 4 : 0000 0000 0000 0000 0000 0000 0000 0100
b = a << 2;
b :   : 0000 0000 0000 0000 0000 0000 0001 0000
b = 16

a : 5 : 0000 0000 0000 0000 0000 0000 0000 0101
b = a << 2;
b :   : 0000 0000 0000 0000 0000 0000 0001 0100
b = 20

a = 


*/