import java.util.*;
class maxandminoftwonumbersusingmathfunction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        System.out.print("Maximum is:");
        System.out.print(Math.max(a,b));
        System.out.println();
        System.out.print("Minimum is:");
        System.out.print(Math.min(a,b));
    }
}
