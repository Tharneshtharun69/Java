import java.util.Scanner;
class Stringcomparisonusingmethod {
    public static boolean strcmp(String a,String b)
    {
        if(a.equals(b))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string:");
        String a=sc.nextLine();
        System.out.print("Enter the second string:");
        String b=sc.nextLine();
        boolean equal=strcmp(a,b);
        if(equal)
        {
            System.out.print("Two strings are equal");
        }
        else
        {
            System.out.print("Two strings are not equal");
        }
    }
}
