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
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.getCause());
		}
	}
}