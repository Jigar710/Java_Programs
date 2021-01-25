//string constructor
class test1{
	public static void main(String[] args){
		
		String str = new String("jigar");
		System.out.println(str);
		
		char c1[] = {'a','b','c','d','e'};
		//System.out.println(c1);
		
		String s1 = new String(c1);
		System.out.println(s1);
		c1[2] = 'z';
		System.out.println(s1);
		String str2 = new String(s1);
		//str2[2] = 'z';
		System.out.println(str2);
		
		char c2[] = {'a','b','c','d','e','f','g'};
		String s2 = new String(c2,2,4);   //(odj,start,num of chars)
		System.out.println(s2);
		
		byte arr[] = {65,66,67,68,69};
		String s3 = new String(arr);
		System.out.println(s3);
		
	}
}

//string length
class test2{
	public static void main(String[] args){
		
		char c1[] = {'a','b','c','d','e'};
		String str = new String(c1);
		System.out.println(str);
		System.out.println(str.length());
	
	}	
}
//string literals
class test3{
	public static void main(String[] args){
		String str = "jigar";
		System.out.println(str);
	}
}
//String concatenation
class test4{
	public static void main(String[] args){
		String s1 = "He is ";
		String s2 = " years old.";
		String s3 = s1 + 15 + s2;
		System.out.println(s3);
		
		String s4 = s1 + 2 + 2;
		String s5 = s1 + (2 + 2);
		System.out.println(s4);
		System.out.println(s5);
	}
}

//String conversion and toString()
class Box{
	double width;
	double height;
	double depth;
	Box(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
	}
	public String toString(){
		return "Dimensions are " + width + " by " + depth + " by " + height + " .";
	}
}
class test5{
	public static void main(String[] args){
		Box b = new Box(1,2,3);
		System.out.println(b);
	}
}

//character extraction
class test6{
	public static void main(String[] args){
		//string.charAt(index)
		String str = "jigar";
		char ch = str.charAt(2);
		System.out.println(ch);
		
		//string.getChars(start, end, target, targetstart)
		char ch2[] = new char[5];
		//str.getChars(1,3,ch2,0);
		str.getChars(1,3,ch2,2);
		System.out.println(ch2);
		
		//getBytes()
		
		//toCharArray()
		char ch3[] = new char[5];
		ch3 = str.toCharArray();
		System.out.println(ch3);
	}
} 

//String comparison
class test7{
	public static void main(String[] args){
		//equals and equalsIgnoreCase
		String s1 = "Jigar";
		String s2 = "jigar";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//compareTo and compareToIgnorecase
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		//regionMatchs
		System.out.println(s1.regionMatches(true,0,s2,0,5));
		
		//diff between equals and ==
		String str1 = "Jigar";
		String str2 = new String("Jigar");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}
}
//Searching Strings
class test8{
	public static void main(String[] args){
		String s1 = "Shekhat Jigar Kishorbhai Jigar";
		String s2 = "Jigar";
		System.out.println(s1.indexOf(s2));
		System.out.println(s1.lastIndexOf(s2));
	}
}

//modifying a String
class test9{
	public static void main(String[] args){
		String s1 = "This is a strong man";
		String s2 = "jigar";
		//substring
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2,9));
		//concatenation
		System.out.println(s1.concat(s2));
		//replace
		System.out.println(s1.replace('s','z'));
		//trim
		String str = "   jigar   ";
		System.out.println(str);
		System.out.println(str.trim());	
	}
}
//data conversion using valueOf()
/*
class Box{
	double width;
	double height;
	double depth;
	Box(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
	}
	public String toString(){
		return "Dimensions are " + width + " by " + depth + " by " + height + " .";
	}
}*/
class test10{
	public static void main(String[] args){
		Box b = new Box(1,2,3);
		System.out.println(b);
		System.out.println(String.valueOf(b));
	}
}
//String toLowerCase( )
//String toUpperCase( )