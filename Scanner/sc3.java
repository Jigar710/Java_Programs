import java.util.*;
import java.io.*;

class test
{
	public static void main(String ar[])throws Exception
	{		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Enter data : ");
		String msg = sc.nextLine();
		
		Scanner sc1 = new Scanner(msg);
		while(sc1.hasNextInt() == true)
		{
			int a = sc1.nextInt();
			System.out.println(a);
		}
	}
}