import java.io.*;
import java.util.*;
class ss
{
	public static void main(String arg[]) throws Exception
	{
		int n;
		FileInputStream frs= new FileInputStream("1.txt");
		FileOutputStream fos= new FileOutputStream("2.txt");
		n=frs.read();
		while(n!=-1)
		{
			fos.write(n);
		//System.out.print((char)n);
		n=frs.read();
		}
	}
}