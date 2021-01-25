//try - try - finally - catch
import java.util.*;
class test
{
	public static void main(String ar[])
	{
		try
		{
			System.out.println("welcome to outer try");
			Scanner sc = new Scanner(System.in);

			int a,b;			
			System.out.println("Enter A : ");
			a = sc.nextInt();
			
			System.out.println("Enter B : ");
			b = sc.nextInt();
			try
			{
				System.out.println("welcome to inner try");
				int c;
				c = a / b;
				System.out.println("Ans : "+c);
				System.out.println("bye from inner try");
			}
			finally
			{
				System.out.println("inner finally");
			}
			System.out.println("bye from outer try");
		}
		catch(Exception e)
		{
			System.out.println("outer : "+e);
		}
		System.out.println("Have a nice day...");
	}
}
