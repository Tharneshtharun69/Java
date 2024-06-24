import java.util.*;
class countnoofdigitsusingstringconversionandstringlength
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int n=sc.nextInt();
        String s=Integer.toString(n);
        System.out.print(s.length());
    }
}
