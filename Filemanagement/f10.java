import java.io.*;
class ss
{
	public static void main(String ar[])throws Exception	
	{
		FileInputStream fis;
		fis = new FileInputStream("f10.java");
		
		DataInputStream dis = new DataInputStream(fis);
		
		String msg = dis.readUTF();
		
		System.out.println(msg);
		
		dis.close();
		fis.close();
	}
}