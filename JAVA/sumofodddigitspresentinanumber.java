import java.util.Scanner;
class sumofodddigitspresentinanumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int r;
        boolean odd=false;
        while(n!=0)
        {
            r=n%10;
            if(r%2!=0)
            {
                odd=true;
                sum=sum+r;
            }
            n/=10;
        }
        System.out.print(sum);
        if(odd==false)
        {
            System.out.print("There are no odd digits in the number");
        }
    }
}
