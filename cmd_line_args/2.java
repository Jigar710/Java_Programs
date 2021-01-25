import java.util.*;

class test2{
    public static void main(String ar[])
    {
       // java test2 10
       //START 0 END 10
       if(ar.length==1)
        {
             int end=Integer.parseInt(ar[0]);
            System.out.println("DECIMAL\tOCTAL\tHEXA\tBINARY");
            for(int i=0;i<=end;i++)
            {
                String oc = Integer.toOctalString(i);
                String he=  Integer.toHexString(i);
                String b=   Integer.toBinaryString(i);
                System.out.println(i+"\t"+oc+"\t"+he+"\t"+b);
            }
        }
        // java test2 10 20
        //START 10 END 20 
        else if(ar.length==2)
        {
            int start=Integer.parseInt(ar[0]);
            int end=Integer.parseInt(ar[1]);
            if(start<=end)
            {
                  System.out.println("DECIMAL\tOCTAL\tHEXA\tBINARY");
                  for(int i=start;i<=end;i++)
                     {
                        String oc = Integer.toOctalString(i);
                        String he=  Integer.toHexString(i);
                        String b=   Integer.toBinaryString(i);
                        System.out.println(i+"\t"+oc+"\t"+he+"\t"+b);
                    }
            }
            else
            {
                System.out.println("START IS LESS THAN END");
            }

        }
         // java test2 10 20 2
        //START 10 END 20 GAP 2
        //START -1 END -5 GAP -1
        else if(ar.length==3)
        {   
            int start=Integer.parseInt(ar[0]);
            int end=Integer.parseInt(ar[1]);
            int gap=Integer.parseInt(ar[2]);
            if(start<end && gap>0)
             {
                    System.out.println("DECIMAL\tOCTAL\tHEXA\tBINARY");
                    for(int i=start;i<=end;i+=gap)
                    {
                        String oc = Integer.toOctalString(i);
                        String he=  Integer.toHexString(i);
                        String b=   Integer.toBinaryString(i);
                        System.out.println(i+"\t"+oc+"\t"+he+"\t"+b);
                    }
             }
            else if(start>end && gap<0)
             {
                     System.out.println("DECIMAL\tOCTAL\tHEXA\tBINARY");
                    for(int i=start;i>=end;i+=gap)
                    {
                        String oc = Integer.toOctalString(i);
                        String he=  Integer.toHexString(i);
                        String b=   Integer.toBinaryString(i);
                        System.out.println(i+"\t"+oc+"\t"+he+"\t"+b);
                    }   
             }
            else
            {
                System.out.println("ERROR");
            }
        }

    }
}