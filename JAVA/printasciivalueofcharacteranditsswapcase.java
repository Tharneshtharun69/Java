import java.util.*;
class asciivalueofcharacteranditsswapcase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch=sc.next().charAt(0);
        int d=(int)ch;
        System.out.println(d);
        if(d>=65&&d<=90)
        {
            int n=d+32;
            System.out.print((char)n);
        }
        else if(d>=97&&d<=122)
        {
            int n=d-32;
            System.out.print((char)n);
        }
        else
        {
            System.out.print("Invalid Character");
        }
    }
}
