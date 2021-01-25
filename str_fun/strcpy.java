import java.util.*;
class Strcpy
{
    public static void main(String ar[])
    {
        String s[];
        Scanner get = new Scanner(System.in);
        System.out.println("enter size:");
        int size = get.nextInt();
        s = new String[size];
        String s2[] =new String[size];
        for(int i=0;i<s.length;i++)
        {
            System.out.print("Enter string:");
            s[i]=get.next();
            s2[i]=s[i];
        }
        for(int i=0;i<s2.length;i++)
        {
            System.out.println(s2[i]);
        }
    }

}