import java.util.*;
class valueofString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        System.out.println("The value of the string is:");
        System.out.print(String.valueOf(s));
    }
}
