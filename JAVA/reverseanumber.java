import java.util.Scanner;
class reverseanumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int r;
        System.out.println("Reversed number is:");
        while(n!=0)
        {
            r=n%10;
            System.out.print(r);
            n/=10;
        }
    }
}
