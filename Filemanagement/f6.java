import java.io.*;
class ss
{
	public static void main(String arg[])
	{
		String s="D:\\7ama_java\\Filemanagement";
		File f=new File(s);
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.length());
		System.out.println(f.getAbsolutePath());
		System.out.println("\n\n");	
		
		String p[]=f.list();
		
		for(int i=0;i<p.length;i++)
		{
			System.out.print(p[i]);
			File temp = new File(f,p[i]);
			if(temp.isFile())
			{
				System.out.println("\t\tFile");
			}
			else
			{
				System.out.println("\t\tFolder");
			}		
		}
	}
}





