import java.util.*;
class oddorevenwithoutmodulusoperator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        if((n/2)*2==n)
        {
            System.out.print("even");
        }
        else
        {
            System.out.print("odd");
        }
    }
}
