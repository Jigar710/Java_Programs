import java.io.*;
class ss
{
	public static void main(String arg[])
	{
		File root = new File("D:/7ama_java/Filemanagement");
		String name = "/aaa/bbb";
		File f = new File(root,name);
		System.out.println(f.mkdirs());
	}
}





