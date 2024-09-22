import java.util.*;
class sumofprimenumberstilln
{
    public static int sum(int n)
    {
        int sum=0;
        for(int i=2;i<=n;i++)
        {
            int divisorcount=0;
            for(int j=1;j<=n;j++)
            {
                if(i%j==0)
                {
                    divisorcount++;
                }
            }
            if(divisorcount==2)
            {
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(sum(n));
    }
}
