import java.util.Scanner;
class Armstrongnoornotusingmathdotpow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int originalnum=n;
        String s=Integer.toString(n);
        int noofdigits=s.length();
        int sum=0;
        int r;
        while(n!=0)
        {
            r=n%10;
            sum=sum+(int)(Math.pow(r,noofdigits));
            n/=10;
        }
        if(sum==originalnum)
        {
            System.out.print("Armstrong no");
        }
        else
        {
            System.out.print("Not an Armstrong no");
        }
    }
}
