import java.util.Scanner;
class digitsumdifferenceoftwonumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        int sumofdigitsofa=0;
        int sumofdigitsofb=0;
        int r;
        while(a!=0)
        {
            r=a%10;
            sumofdigitsofa=sumofdigitsofa+r;
            a/=10;
        }
        while(b!=0)
        {
            r=b%10;
            sumofdigitsofb=sumofdigitsofb+r;
            b/=10;
        }
        System.out.print("The digit sum difference of a and b is:");
        System.out.print(Math.max(sumofdigitsofa,sumofdigitsofb)-Math.min(sumofdigitsofa,sumofdigitsofb));
    }
}
