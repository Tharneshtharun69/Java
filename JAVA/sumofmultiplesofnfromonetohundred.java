import java.util.Scanner;
class sumofmultiplesofnfromonetohundred
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=100;i++)
        {
            sum=sum+i*n;
        }
        System.out.println("The sum of multiples of "+n+" from 1 to 100 is:"+sum);
    }
}
