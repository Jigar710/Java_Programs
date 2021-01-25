import java.io.*;
class ss
{
	public static void main(String ar[])throws Exception
	{
		FileReader fr = new FileReader("fr.java");
		BufferedReader br = new BufferedReader(fr);
		
		String msg = br.readLine();
		
		while(msg != null)
		{			
			System.out.println(msg);			
			msg = br.readLine();
		}
	}
}