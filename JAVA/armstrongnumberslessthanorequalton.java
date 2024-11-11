import java.util.*;
class armstrongnumberslessthanorequalton
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        for(int i=1;i<=n;i++)
        {
            int sum=0;
            int a=i;
            int b=a;
            int noofdigits=Integer.toString(a).length();
            while(a!=0)
            {
                r=a%10;
                sum=sum+(int)Math.pow(r,noofdigits);
                a/=10;
            }
            if(sum==b)
            {
                System.out.print(i);
            }
        }
    }
}
