import java.util.Scanner;
class primenumbersfrom1ton
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number upto which you want to print the prime numbers:");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            int divisorcount=0;
            for(int j=1;j<n;j++)
            {
                if(i%j==0)
                {
                    divisorcount++;
                }
            }
            if(divisorcount==2)
            {
                System.out.print(i+" ");
            }
        }
    }
}
