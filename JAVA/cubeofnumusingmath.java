import java.util.Scanner;
class cubeofnumusingmath
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.print("The cube of "+n+" is:");
        System.out.print(Math.pow(n,3));
    }
}
