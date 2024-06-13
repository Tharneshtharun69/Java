import java.util.*;
class oddsumandevensum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int oddsum=0;
        int evensum=0;
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                evensum=evensum+i;
            }
            else
            {
                oddsum=oddsum+i;
            }
        }
        System.out.print("The sum of all odd numbers from 1 to "+n+" is:"+oddsum);
        System.out.println();
        System.out.print("The sum of all even numbers from 1 to "+n+" is:"+evensum);
    }
}
