import java.util.Scanner;
class Strllen
{
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
            System.out.println(s[i]+":"+s[i].length());
        }
    }
}