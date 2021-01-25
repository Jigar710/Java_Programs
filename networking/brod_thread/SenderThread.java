import java.util.*;
import java.io.*;

class SenderThread extends Thread
{
	Scanner sc;
	DataOutputStream dos;
	String msg;
	
	SenderThread(OutputStream os,String msg)
	{
		sc = new Scanner(System.in);
		dos = new DataOutputStream(os);
		this.msg=msg;
	}
	public void run()
	{
		
			try
			{
				dos.writeUTF(msg);
			}
			catch(Exception e)
			{}
		
	}
}