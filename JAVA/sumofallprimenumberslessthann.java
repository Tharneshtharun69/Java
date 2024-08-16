import java.util.Scanner;
class sumofallprimenumberslessthann
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=2;i<n;i++)
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
                sum=sum+i;
            }
        }
        System.out.println("The sum of all prime numbers less than "+n+" is:");
        System.out.print(sum);
    }
}
