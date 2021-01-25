import java.util.*;
class Stringrev
{
    public static void main(String ar[])
    {
        String s[]=new String[10];
        Scanner get=new Scanner(System.in);
        for(int i=0;i<s.length;i++)
        {
            System.out.println("Enter String:");
            s[i]=get.next();
        }
        for(int i=s.length-1;i>=0;i--)
        {
            System.out.println(s[i]);
        }
        

    }
}