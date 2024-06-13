import java.util.Scanner;
class sumofsquaresofnfromoneton
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i*i;
        }
        System.out.println();
        System.out.println("The sum of squares of "+n+" from 1 to "+n+" is: "+sum);
    }
}
