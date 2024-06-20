import java.util.Scanner;
class sumofnnaturalnumbersusingdowhile
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an number:");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        do{
            sum=sum+i;
            i++;
        }while(i<=n);
        System.out.print("Sum of natural numbers from 1 to "+n+" is:"+sum);
    }
}
