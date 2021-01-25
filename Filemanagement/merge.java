import java.io.*;

class first
{
public static void main(String arg[]) throws Exception
{
	FileInputStream fis = new FileInputStream("1.txt");
	FileOutputStream fos = new FileOutputStream("d1.txt");
	
	int n;
	n = fis.read();
	
	while(n!= -1)
	{
		fos.write(n);
		n = fis.read();
	}

	FileInputStream fis1 = new FileInputStream("2.txt");
	

	n = fis1.read();
	
	while(n!= -1)
	{
		fos.write(n);
		n = fis1.read();
	}
	
}
}