import java.util.*;
class Strmerge
{
    public static void main(String ar[])
    {
        String s1[]=new String[5];
        String s2[]=new String[3],s3[]=new String[s1.length+s2.length];
        Scanner get=new Scanner(System.in);
        int j=0;
        
        for(int i=0;i<s1.length;i++)
        {
            System.out.print("Enter String 1:");
            s1[i]=get.nextLine();
        }
         for(int i=0;i<s2.length;i++)
        {
            System.out.print("Enter String 2:");
            s2[i]=get.nextLine();
        }
         for(int i=0;i<s1.length;i++,j++)
        {
           s3[i]=s1[i];

        }
         for(int i=0;i<s2.length;i++,j++)
        {
           s3[j]=s2[i];
        }
        System.out.print("MERGED STRING:\n");
         for(int i=0;i<s3.length;i++)
        {
            
            System.out.println(s3[i]);
        }
    }
}