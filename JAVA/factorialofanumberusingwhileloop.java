import java.util.*;
class factorialofanumberusingwhileloop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int i=1;
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("The factorial of "+n+" is:"+fact);
    }
}
