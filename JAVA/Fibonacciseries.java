import java.util.Scanner;
class fibonacciseries{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of terms that you want to print Fibonacci series:");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
        int next;
        for(int i=2;i<n;i++)
        {
            next=first+second;
            System.out.print(next+" ");
            first=second;
            second=next;
        }
    }
}