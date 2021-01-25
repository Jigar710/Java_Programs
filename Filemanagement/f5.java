
import java.io.*;
import java.util.*;
class ss
{
	public static void main(String arg[]) throws Exception
	{
		FileInputStream fis1=new FileInputStream("1.txt");
		FileInputStream fis2=new FileInputStream("2.txt");
		FileInputStream fis3=new FileInputStream("3.txt");
		FileInputStream fis4=new FileInputStream("4.txt");
		
		Vector<FileInputStream> v=new Vector<>();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		v.add(fis4);
		
		Enumeration<FileInputStream> e=v.elements();
		SequenceInputStream seq=new SequenceInputStream(e);
		
		int n;
		n=seq.read();
		
		while(n!=-1)
		{
			System.out.print((char)n);
			n=seq.read();
		}
		
		
	}
}