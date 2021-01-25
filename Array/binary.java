import java.util.*;
class test
{
	public static void main(String ar[])
	{
		int n,bn,index;
		int bin[]=new int[16];
		
		index=bin.length-1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		n=sc.nextInt();
		
		while(n!=0)
		{
			bn=n%2;
			bin[index]=bn;
			index--;
			n=n/2;
		}
		
		for(int i=0;i<bin.length;i++)
		{
				System.out.print(bin[i]+" ");
		}
	}
}