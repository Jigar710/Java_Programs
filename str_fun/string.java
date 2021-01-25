class str
{
	public static void main(String ar[])
	{
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = s1;
				
		System.out.println("s1 : " + System.identityHashCode(s1));
		System.out.println("s2 : " + System.identityHashCode(s2));
		System.out.println("s3 : " + System.identityHashCode(s3));
		
		if(s1.equals(s2))
			System.out.println("Both are same");
		else
			System.out.println("Both are not same");
			
		
	}
}