import java.util.Scanner;
class divisorcount{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int divisorcount=0;
        int i=1;
        while(i<=n)
        {
            if(n%i==0)
            {
                divisorcount++;
            }
            i++;
        }
        System.out.print("The divisor count is:");
        System.out.print(divisorcount);
    }
}
