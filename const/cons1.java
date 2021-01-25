/*Constructor - Special function
			1 no rtn_type
			2 class name & function must be same
			3 func Calling - it will execute auto. when obj is created
								(MA provide)*/

class time
{
	int a;
	
	time()
	{
		System.out.println("Object created 1");
	}
	void disp(int x)
	{
		System.out.println("Welcome disp 2");
	}
}
class test
{
	public static void main(String ar[])
	{
		time t1 = new time();
	}
}


/* function overloading

function with same name - having different number of arguments as well as
type of args.

*/
	