import java.util.Scanner;
class sumofevendigitspresentinanumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int r;
        boolean even=false;
        while(n!=0)
        {
            r=n%10;
            if(r%2==0)
            {
                even=true;
                sum=sum+r;
            }
            n/=10;
        }
        System.out.print(sum);
        if(even==false)
        {
            System.out.print("There are no even digits in the number");
        }
    }
}
