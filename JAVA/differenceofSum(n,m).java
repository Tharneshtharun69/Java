//Accenture question:
//If Input is m = 6, n = 30, then output will be 285. Integers divisible by
//6 are 6, 12, 18, 24, and 30. Their sum is 90
import java.util.*;
class differenceofSum(n,m)
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no by which the numbers in the range need to be divided:");
        int m=sc.nextInt();
        System.out.print("Enter the end value:");
        int end=sc.nextInt();
        int divisiblesum=0;
        int notdivisiblesum=0;
        for(int i=1;i<=end;i++)
        {
            if(i%m==0)
            {
                divisiblesum+=i;
            }
            else
            {
                notdivisiblesum+=i;
            }
        }
        System.out.print(Math.max(divisiblesum,notdivisiblesum)-Math.min(divisiblesum,notdivisiblesum));
    }
}
