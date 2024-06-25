import java.util.Scanner;
class perfectnoornot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.print("Perfect Number");
        }
        else
        {
            System.out.print("Not a Perfect Number");
        }
    }
}
