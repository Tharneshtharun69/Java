import java.util.*;
class charactertobinaryStringusingIntegerdottoBinaryString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch=sc.nextLine().charAt(0);
        System.out.print(Integer.toBinaryString(ch));
    }
}
