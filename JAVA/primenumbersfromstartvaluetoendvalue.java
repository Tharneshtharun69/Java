import java.util.Scanner;
class primenumbersfromstartvaluetoendvalue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a start value from which you want to print prime numbers:");
        int start=sc.nextInt();
        System.out.print("Enter a end value upto which you want to print prime numbers:");
        int end=sc.nextInt();
        System.out.print("Prime numbers from "+start+" to "+end+" are:");
        System.out.println();
        for(int i=start;i<=end;i++)
        {
            int divisorcount=0;
            for(int j=1;j<=end;j++)
            {
                if(i%j==0)
                {
                    divisorcount++;
                }
            }
            if(divisorcount==2)
            {
                System.out.println(i);
            }
        }
    }
}
