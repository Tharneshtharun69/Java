import java.util.*;
class ReverseIntegerByIntegertoStringConversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        String reversed=Integer.toString(a);
        System.out.print("Reversed Integer is:");
        for(int i=reversed.length()-1;i>=0;i--)
        {
            System.out.print(reversed.charAt(i));
        }
    }
}
