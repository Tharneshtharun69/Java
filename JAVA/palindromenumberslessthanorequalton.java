import java.util.Scanner;
class palindromenumberslessthanorequalton
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int rev=0;
            int a=i;
            int copy=a;
            int r;
            while(a!=0)
            {
                r=a%10;
                rev=rev*10+r;
                a/=10;
            }
            if(rev==copy)
            {
                System.out.print(rev+" ");
            }
        }
    }
}
