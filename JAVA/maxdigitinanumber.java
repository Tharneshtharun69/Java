import java.util.*;
class maxdigitinanumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int max=0;
        int r;
        while(n!=0)
        {
            r=n%10;
            if(r>max)
            {
                max=r;
            }
            n/=10;
        }
        System.out.print("Max digit in the no is:");
        System.out.println(max);
    }
}