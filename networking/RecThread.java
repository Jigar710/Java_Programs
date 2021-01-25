import java.io.*;
class RecThread extends Thread
{
	DataInputStream dis;
	RecThread(InputStream is)
	{
		dis = new DataInputStream(is);
	}
	public void run()
	{
		while(true)
		{
			try
			{
				String msg = dis.readUTF();
				System.out.println(msg);
			}
			catch(Exception e)
			{}
		}
	}
}