import java.util.Scanner;
class checkifanumberiscubenumberornot{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        boolean cubenumber=false;
        for(int i=1;i<n;i++)
        {
            if((i*i*i)==n)
            {
                System.out.print("It is a cube number");
                cubenumber=true;
                break;
            }
        }
        if(cubenumber==false)
        {
            System.out.print("It is not a cube number");
        }
    }
}
