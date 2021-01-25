import java.net.*;
import java.io.*;
import java.util.*;
class server1
{
	public static void main(String ar[])throws Exception
	{
		ServerSocket ss = new ServerSocket(1000);
		
		Socket s = ss.accept();
		
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		InputStream is = s.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			String msg = sc.next();
			dos.writeUTF(msg);
			
			msg = dis.readUTF();
			System.out.println(msg);
		}
	}
}