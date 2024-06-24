import java.util.*;
class oddnumbersfrom1tonwithoutmodulooperator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.print("The odd numbers from 1 to "+n+" are:");
        System.out.println();
        for(int i=1;i<=n;i=i+2)
        {
            System.out.println(i);
        }
    }
}
