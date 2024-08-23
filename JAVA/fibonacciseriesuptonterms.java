import java.util.Scanner;
class fibonacciseriesuptonterms{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int next;
        System.out.print(first+" "+second+" ");
        for(int i=3;i<=n;i++)
        {
            next=first+second;
            System.out.print(next+" ");
            first=second;
            second=next;
        }
    }
}
