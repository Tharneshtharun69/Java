import java.util.*;
class sumofnnaturalnumbersusingmethod
{
    public static int sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("The sum of numbers from 1 to "+n+" is: "+sum(n));
    }
}
