import java.util.Scanner;
class positiveornegativeorzero
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer:");
        int a=sc.nextInt();
        if(a>0)
        {
            System.out.print("Positive");
        }
        else if(a<0)
        {
            System.out.print("Negative");
        }
        else
        {
            System.out.print("Zero");
        }
    }
}
