import java.util.*;
class test
{
	public static void main(String ar[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int a;
			
			System.out.println("Enter data : ");
			a = sc.nextInt();
			
			if(a>0)
			{
				ArithmeticException ae;
				ae = new ArithmeticException();
				throw ae;
			}
			
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.getCause());
		}
	}
}