import java.util.*;
class asciivalueofcapscharacteranditslowercase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch=sc.next().charAt(0);
        int d=ch;
        System.out.println(d);
        int m=d^32;
        System.out.println((char)m);
    }
}
