import java.util.Scanner;
class sumofnumbersfrom1tonusingwhileloop
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int i=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("The sum of numbers from 1 to "+n+" is: "+sum);
    }
}
