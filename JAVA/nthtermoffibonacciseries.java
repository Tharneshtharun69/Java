import java.util.*;
class nthtermoffibonacciseries{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the nth term for which you want to find the Fibonacci term:");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int next=0;
        for(int i=3;i<=n;i++)
        {
            next=first+second;
            first=second;
            second=next;
        }
        int nth=next;
        System.out.print(n+"th term of Fibonacci series is:");
        System.out.print(nth);
    }
}