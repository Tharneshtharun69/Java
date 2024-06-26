import java.util.*;
class bitcountofanumber//no of ones in binary value of a number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int n=sc.nextInt();
        int bitcount=Integer.bitCount(n);
        System.out.print(bitcount);
    }
}
