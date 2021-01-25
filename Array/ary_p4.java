import java.util.*;
class test
{
	public static void main(String ar[])
	{
		int a[]=new int[5];
		int pos=0,neg=0,zero=0;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter Number : ");
			a[i]=sc.nextInt();
				
			if(a[i]>0)
				pos++;
			else if(a[i]<0)
				neg++;
			else	
				zero++;
			
		}
		System.out.println("pos : "+pos);
		System.out.println("neg : "+neg);
		System.out.println("zero : "+zero);
	}
}