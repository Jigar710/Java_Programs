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
			
			System.out.println(a);
		}
		finally
		{
			System.out.println("have a nice day...");
		}
	}
}