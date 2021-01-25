import java.io.*;
class ss
{
	public static void main(String ar[])throws Exception	
	{
		FileInputStream fis;
		fis = new FileInputStream("myfiile.txt");
		
		int a = fis.read();
		
		while(a!=-1)
		{
			if(a==' ')
			{
				System.out.println();
			}
			else
			{
				System.out.print((char)a);
			}
			a = fis.read();
		}
	}
}