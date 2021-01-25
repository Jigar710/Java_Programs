import java.io.*;
import java.util.*;

class ss
{
	public static void main(String arg[]) throws Exception
	{
		FileInputStream fis1 = new FileInputStream("1.txt");
		FileInputStream fis2 = new FileInputStream("2.txt");
		FileInputStream fis3 = new FileInputStream("3.txt");
		FileInputStream fis4 = new FileInputStream("4.txt");
		FileInputStream fis5 = new FileInputStream("5.txt");
		FileInputStream fis6 = new FileInputStream("6.txt");
		FileInputStream fis7 = new FileInputStream("7.txt");
		FileInputStream fis8 = new FileInputStream("8.txt");
		FileInputStream fis9 = new FileInputStream("9.txt");
		FileInputStream fis10 = new FileInputStream("10.txt");
		
		Vector<FileInputStream> v = new Vector<>();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		v.add(fis4);
		v.add(fis5);
		v.add(fis6);
		v.add(fis7);
		v.add(fis8);
		v.add(fis9);
		v.add(fis10);

		Enumeration<FileInputStream> e = v.elements();
		
		SequenceInputStream seq = new SequenceInputStream(e);
		
		FileOutputStream fos = new FileOutputStream("20.txt");	
		
		int n;
		n = seq.read();
		
		while(n!=-1)
		{
			fos.write(n);
			n = seq.read();
		}
		
	}
}