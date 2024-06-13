import java.util.*;
class StringtoIntegerConversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        int a=Integer.parseInt(s);
        System.out.print("The Integer is:");
        System.out.print(a);
    }
}
