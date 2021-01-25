/*
	String + int = String
*/
class test7
{
	public static void main(String ar[])
	{
		int a,b,c;
		a = 10;
		b = 20;
		c = a + b;
		System.out.print("Addition = ");
		System.out.println(c);
		
		System.out.println("\nAddition = "+c);
		
		System.out.println("\nA = "+a);
		System.out.println("B = "+b);
		System.out.println("C = "+c);
		
		System.out.println("A\tB\tC");
		System.out.println(a+"\t"+b+"\t"+c);
		
		System.out.println("\nc = a + b");
		System.out.println(c+" = "+a+" + "+b);
		
		System.out.println("\nThe addition of "+a+" and "+b+" is " +c);
	}
}
/*
1. Addition = 30

2. A = 10
   B = 20
   C = 30
   
3.	A	B	C
	10	20	30
	
4.
	c = a + b
	30 = 10 + 20
5.
	The addition of 10 and 20 is 30
*/
