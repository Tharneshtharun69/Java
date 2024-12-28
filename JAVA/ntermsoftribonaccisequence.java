import java.util.Scanner;
class ntermsoftribonaccisequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int zeroth=0;
        int first=0;
        int second=1;
        int i=3;
        int nth=0;
        if(n==0)
        {
            System.out.print(zeroth);
        }
        else if(n==1)
        {
            System.out.print(zeroth+" "+first);
        }
        else if(n==2)
        {
            System.out.print(zeroth+" "+first+" "+second+" ");
        }
        else
        {
             System.out.print(zeroth+" "+first+" "+second+" ");
            while(i<=n)
            {
                nth=zeroth+first+second;
                System.out.print(nth+" ");
                zeroth=first;
                first=second;
                second=nth;
                i++;
            }
        }
    }
}
