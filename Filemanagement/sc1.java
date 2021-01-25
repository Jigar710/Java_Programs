import java.io.*;
import java.util.*;
class ss
{
	public static void main(String ar[])throws Exception	
	{
		FileInputStream fis;
		fis = new FileInputStream("myfiile.txt");
		
		Scanner sc = new Scanner(fis);
		
		String msg = sc.next();
		while(sc.hasNext()==true)
		{
			System.out.println(msg);
			msg = sc.next();
		}
		
		fis.close();
	}
}