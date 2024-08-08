import java.util.*;
class palindromenoornot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ori=n;
        int r;
        int rev=0;
        while(n!=0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n/=10;
        }
        if(ori==rev)
        {
            System.out.print("Palindrome no");
        }
        else
        {
            System.out.print("not Palindrome no");
        }
    }
}
