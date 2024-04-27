import java.util.*;
class Stringreverseusingarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        System.out.println("The reversed string is:");
        for(int i=c.length-1;i>=0;i--)
        {
            System.out.print(c[i]);
        }
    }
}
