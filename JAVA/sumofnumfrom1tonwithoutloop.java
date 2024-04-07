import java.util.Scanner;

class sumofnumfrom1tonwithoutloop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        int sum = (n * (n + 1)) / 2;
        System.out.println("sum of num from 1 to " + n + " is" + " " + sum);
    }
}