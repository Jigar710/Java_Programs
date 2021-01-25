//Write a program to merge two file in third one.
import java.io.*;
//import java.util.*;
class ss
{
	public static void main(String arg[]) throws Exception
	{
		FileInputStream fis1=new FileInputStream("1.txt");
		FileInputStream fis2=new FileInputStream("2.txt");
		
		SequenceInputStream seq=new SequenceInputStream(fis1,fis2);
		
		int n;
		n=seq.read();
		
		while(n!=-1)
		{
			System.out.print((char)n);
			n=seq.read();
		}
		
		
	}
}