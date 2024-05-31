import java.util.*;
class arithmeticexception
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        System.out.print(num/0);
    }
}
