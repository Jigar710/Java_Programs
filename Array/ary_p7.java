import java.util.*;
class test
{
	public static void main(String ar[])
	{
		int a[]=new int[5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter Number : ");
			a[i]=sc.nextInt();
			if(a[i]%2!=0)
			{
				sum=sum+a[i];
			}
			
		}
		System.out.println("Addition : "+sum);
	}
}



