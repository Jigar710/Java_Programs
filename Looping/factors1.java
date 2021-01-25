/*
wap to disp factors of the given number 
Ex : input : 10
		1,2,5,10
*/
import java.util.*;
class factor
{
	public List<Integer> getFactors(int n)
	{
		List<Integer> li = new ArrayList<>();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				li.add(i);
			}
		}
		return li;
	}
}
class demo
{
	public static void main(String ar[])
	{
		factor f = new factor();
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		n = sc.nextInt();
		
		List<Integer> li = f.getFactors(n);
		System.out.println("Factors of given number : ");
		System.out.println(li);
	}
}