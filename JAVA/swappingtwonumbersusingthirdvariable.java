import java.util.Scanner;
class swappingtwonumbersusingthirdvariable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println("Before swapping the values:");
        System.out.print("The value of a is:"+a);
        System.out.println();
        System.out.print("The value of b is:"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println();
        System.out.print("After swapping the values:");
        System.out.println();
        System.out.print("The value of a is:"+a);
        System.out.println();
        System.out.print("The value of b is:"+b);
    }
}
