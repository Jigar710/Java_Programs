import java.io.*;
class MyThread extends Thread
{
	DataOutputStream dos;
	DataInputStream dis;
	MyThread(InputStream is,OutputStream os)
	{
		dos = new DataOutputStream(os);
		dis = new DataInputStream(is);
	}
	public void run()
	{
		while(true)
		{
			try
			{
				String msg = dis.readUTF();
				dos.writeUTF(msg);
			}
			catch(Exception e)
			{}
		}
	}
}