import java.io.*;
class ss
{
	public static void main(String ar[])throws Exception
	{
		FileReader fr = new FileReader("fr.java");
		
		int n = fr.read();	
		
		while(n!=-1)
		{
			System.out.print((char)n);			
			n = fr.read();
		}
	}
}