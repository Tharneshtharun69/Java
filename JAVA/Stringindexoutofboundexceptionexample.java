import java.util.*;
class Stringindexoutofboundexceptionexample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(s.length()+1));
        }
    }
}
