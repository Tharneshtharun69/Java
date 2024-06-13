import java.util.Scanner;
class apowerb
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a=sc.nextInt();
        System.out.print("Enter the value of b :");
        int b=sc.nextInt();
        System.out.println();
        System.out.println("The value of "+a+"to the power of "+b+" is: "+Math.pow(a,b));
    }
}
