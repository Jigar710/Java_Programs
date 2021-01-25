class test
{
	public static void main(String ar[])
	{
		//String Literal
		String s1="";
		String s2=new String();
		
		boolean b=s1.isEmpty();
		System.out.println(b);
		
		b=s2.isEmpty();
		System.out.println("isEmpty : "+b);
		
		String s3="Mahesh";
		char g=s3.charAt(2);
		System.out.println("chatAt : "+g);
		
		String s4="This is good day";
		String s5="is good";
		b=s4.contains(s5);
		System.out.println("Contains : "+b);
		
		String s6="NAME";			// s1==s2
		b=s6.equals("Name");
		System.out.println("equals : "+b);
		b=s6.equalsIgnoreCase("name");
		System.out.println("equals : "+b);
		
		String s7="abc";
		String s8="xyz";
		
		String s9 = s7.concat(s8);
		System.out.println("Concat : "+s7);
		System.out.println("Concat : "+s8);
		System.out.println("Concat : "+s9);
		
	}
}