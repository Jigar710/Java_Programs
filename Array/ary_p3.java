import java.util.*;
class test
{
	public static void main(String ar[])
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int ev=0,od=0;
				
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter Number : ");
			a[i]=sc.nextInt();
			
			if(a[i]%2==0)
			{
				ev++;
			}
			else
			{
				od++;
			}
		}
		System.out.println("Even : "+ev);
		System.out.println("Odd : "+od);
	}
}



