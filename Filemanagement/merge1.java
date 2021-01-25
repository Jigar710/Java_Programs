import java.io.*;

class ss
{
	public static void main(String arg[]) throws Exception
	{
		FileInputStream fis1 = new FileInputStream("1.txt");
		FileInputStream fis2 = new FileInputStream("2.txt");
		
		SequenceInputStream seq = new SequenceInputStream(fis1, fis2);
		
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