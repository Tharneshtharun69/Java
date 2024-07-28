import java.util.Scanner;
class sumofodddigitsandevendigitsinanumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int oddsum=0;
        int evensum=0;
        int r;
        while(n!=0)
        {
            r=n%10;
            if(r%2==0)
            {
                evensum=evensum+r;
            }
            else
            {
                oddsum=oddsum+r;
            }
            n/=10;
        }
        System.out.println("sum of odd digits: "+oddsum);
        System.out.println("sum of even digits: "+evensum);
    }
}
