import java.util.Scanner;
import java.io.*;

class CharAndNumCount{
	String x;
	CharAndNumCount(String x){
		this.x=x;
		try{
			File f=new File(x);
			Scanner in=new Scanner(f);
			String test="";
		
			System.out.println("File content: ");
			while(in.hasNextLine()){
				String s=in.nextLine();
				System.out.println(s);
				test=test+s;
			}
		
			System.out.println("-------------");
			
			char[] ch= test.toCharArray();
			int chrct=0,tc=0,num=0,space=0,spchar=0,tab=0;
			
			for(int i=0;i<test.length();i++){
				if(Character.isLetter(ch[i])){
					chrct++;
				}
				else if(Character.isDigit(ch[i])){
					num++;
				}
			}
			System.out.println("\nAlphabtical characters: "+chrct+"\nNumbers: "+num);
		
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
class Ass2_2{
 public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter file name: ");
		String x=in.nextLine();
		
		new CharAndNumCount(x);
	}
}

