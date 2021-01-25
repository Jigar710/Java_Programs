/*
marker interface
	interface having no abstrct methods
	use to provide metadata to the JVM
	metadata : data @ data
	*/
import java.io.*;
class emp implements Serializable
{
	String name;
	int age;
	void set()
	{
		name = "sahil";
		age = 20;
	}
	void disp()
	{
		System.out.println("name = "+name);
		System.out.println("Age = "+age);
	}
}
class ss
{
	public static void main(String a[])throws Exception
	{
		/*emp e = new emp();
		e.set();
		
		FileOutputStream fos = new FileOutputStream("data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e);
		
		oos.close();
		fos.close();*/
		
		emp e = new emp();
		FileInputStream fis = new FileInputStream("data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		e = (emp)ois.readObject();
		e.disp();		
	}
}