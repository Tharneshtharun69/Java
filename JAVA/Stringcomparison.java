import java.util.Scanner;
class Stringcomparison{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string:");
        String a=sc.nextLine();
        System.out.print("Enter the second string:");
        String b=sc.nextLine();
        if(a.equals(b))
        {
            System.out.print("Two strings are equal");
        }
        else
        {
            System.out.print("Two strings are not equal");
        }
    }
}
