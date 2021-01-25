import java.util.*;
import java.io.*;

class SenderTherad extends Thread
{
	Scanner sc;
	DataOutputStream dos;
	
	SenderTherad(OutputStream os)
	{
		sc = new Scanner(System.in);
		dos = new DataOutputStream(os);
	}
	public void run()
	{
		while(true)
		{
			try
			{
				String msg = sc.nextLine();
				dos.writeUTF(msg);
			}
			catch(Exception e)
			{}
		}
	}
}