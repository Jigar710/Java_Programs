//to read the file and copy it into another file
import java.io.*;
import java.util.*;
class ss
{
	public static void main(String ar[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Etner the source file name\t");
		String iName = sc.next(); 
		
		File root = new File("D:\\7ama_java\\Filemanagement");		
		File f = new File(root,iName);
		
		if(f.exists() == false)
		{
			System.out.println("source file does not exists \n"+f.getAbsolutePath());
			return;
		}
		
		System.out.print("Etner the targetted file name\t");
		String tName = sc.next();
		
		String status;
		boolean b = true;
		
		f = new File(root,tName);
		if(f.exists() == true)
		{
			System.out.println("destination file already exists. Do u watn to override it (Y/N)");
			status = sc.next();
			if(status == "y")
			{
				b = false;
			}				
		}
		
		
		FileInputStream fis;
				fis = new FileInputStream(iName);
		
		FileOutputStream fos = 
				new FileOutputStream(tName,b);
						
		int n = fis.read();
		while(n!=-1)
		{			
			fos.write(n);
			n = fis.read();
		}
	}
}