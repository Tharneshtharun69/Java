import java.util.Scanner;
class noofdigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int n=sc.nextInt();
        int noofdigit=0;
        while(n!=0)
        {
            int r=n%10;
            noofdigit++;
            n/=10;
        }
        System.out.print("no of digits in the number is:"+noofdigit);
    }
}
