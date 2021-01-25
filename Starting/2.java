class test3
{
	public static void main(String ar[])
	{
		System.out.print("hello world");
		test4.disp();
	}
}
class test4
{
	static void disp()
	{
		System.out.print("welcome to java");
	}
}

/*

java test

javap java.lang.System | more
javap java.io.PrintStream | more

print() : member function of java.io.PrintStream clas
	    : public
		: non-static
		: to access print() need an object of PrintStream class
		
out 	: object of PrintStream class
		: member of java.lang.System class
		: public
		: static
		
System  : use to access out object
		
*/