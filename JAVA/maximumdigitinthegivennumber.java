import java.util.*;
class maximumdigitinthegivennumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int n=sc.nextInt();
        int max=0;
        for(int i=1;n>0;i++)
        {
            if((n%10)>max)
            {
                max=n%10;
            }
            n/=10;
        }
        System.out.print("maximum digit in the given no is:"+ max);
    }
}
