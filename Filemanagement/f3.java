//Write a program to merge two file in third one.
import java.io.*;
//import java.util.*;
class ss
{
	public static void main(String arg[]) throws Exception
	{
		int n;
		FileOutputStream fos= new FileOutputStream("3.txt");
		
		FileInputStream fis1= new FileInputStream("1.txt");
		
		n=fis1.read();
		while(n!=-1)
		{
			fos.write(n);
		//System.out.print((char)n);
		n=fis1.read();
		}
		fis1.close();
		
		FileInputStream fis2= new FileInputStream("2.txt");
		n=fis2.read();
		while(n!=-1)
		{
			fos.write(n);
		//System.out.print((char)n);
		n=fis2.read();
		}
		fis2.close();
	}
}