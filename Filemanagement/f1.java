import java.io.*;
import java.util.*;
class ss
{
	public static void main(String arg[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String name;
		
		System.out.print(" Enter name : ");
		name=sc.next();
		
		int n;
		FileInputStream frs= new FileInputStream(name);
		n=frs.read();
		while(n!=-1)
		{
		System.out.print((char)n);
		n=frs.read();
		}
	}
}