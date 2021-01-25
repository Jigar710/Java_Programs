import java.util.*;
import java.io.*;

class test
{
	public static void main(String ar[])throws Exception
	{
		FileInputStream fis;
		fis = new FileInputStream("sc1.java");
		
		Scanner sc;
		sc = new Scanner(fis);
		
		String msg;
		
		while(sc.hasNextLine() == true)
		{
			msg = sc.nextLine();
			System.out.println(msg);
		}
	}
}		