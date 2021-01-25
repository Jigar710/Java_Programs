/*	original    : this is a good DAY ()
	lower       : this is a good day
	UPPER       : THIS IS A GOOD DAY 
	Sentense    : This is a good day 
	Toggle      : THIS IS A GOOD day 
	Title       : This Is A Good Day */
	
class test
{
	public static void main(String ar[])
	{
		String s1 = "this is a good DAY";	
		char ch[] = s1.toCharArray();
		System.out.println(s1);
		
		if(ch[0]>='a' && ch[0]<='z')
		{
			ch[0] = (char)(ch[0] - 32);
		}
		for(int i=1;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i] = (char)(ch[i] + 32);
			}
		}
		String s2 = new String(ch);
		System.out.println("Sentense : "+s1);
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i] = (char)(ch[i] + 32);
			}
			else
			{
				ch[i] = (char)(ch[i] - 32);
			}
		}
		String s3 = new String(ch);
		System.out.println("Toggle    : "+s3);
	}
}

/* 
Vowel & cons.
Space
Total Number charachter(with space)
total Number of Word

Vowel & cons. --> Seprate String
s1 = "wonderfull"
v = "oeu"
c = "wndrfll"
*/

