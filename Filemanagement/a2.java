import java.util.*;
interface first
{
	void disp();
}
class ss
{
	public static void main(String ar[])throws Exception
	{
		first z = new first()
		{
			public void disp()
			{
				System.out.println("hi");
			}
		};
		z.disp();
	}
}