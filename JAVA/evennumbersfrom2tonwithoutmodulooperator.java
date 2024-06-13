import java.util.*;
class evennumbersfrom2tonwithoutmodulooperator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.println();
        System.out.print("The even numbers from 2 to "+n+" are:");
        System.out.println();
        for(int i=2;i<=n;i=i+2)
        {
            System.out.println(i);
        }
    }
}
