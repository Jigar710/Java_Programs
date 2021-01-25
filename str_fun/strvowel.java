import java.util.*;
class Strvow{
    public static void main(String a[])
    {
        String s[]=new String[5];
        Scanner get=new Scanner(System.in);
        for(int i=0;i<s.length;i++)
        {
            System.out.print("Enter String:");
            s[i]=get.nextLine();
        }
        for(int i=0;i<s.length;i++)
        {
            s[i].toLowerCase();
            for(int j=0;j<s[i].length();j++)
            {
                if(s[i].charAt(j)=='a' || s[i].charAt(j)=='e' || s[i].charAt(j)=='i' || s[i].charAt(j)=='o' || s[i].charAt(j)=='u' )
                {
                    System.out.println(s[i]);
                    break;
                }
            }
        }

    }
}