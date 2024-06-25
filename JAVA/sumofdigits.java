import java.util.Scanner;
class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int sum=0;
        int r;
        while(n!=0)
        {
            r=n%10;
            sum=sum+r;
            n/=10;
        }
        System.out.print(sum);
    }
}
