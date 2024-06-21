import java.util.Scanner;
class exactlythreepositivedivisorsornot{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int positivedivisorscount=0;
        int i=1;
        while(i<=n)
        {
            if(n%i==0)
            {
                positivedivisorscount++;
            }
            i++;
        }
        if(positivedivisorscount==3)
        {
            System.out.println(true);
            System.out.println("The number have exactly three positive divisors");
        }
        else
        {
            System.out.println(false);
            System.out.println("The number does not have exactly three positive divisors");
        }
    }
}
