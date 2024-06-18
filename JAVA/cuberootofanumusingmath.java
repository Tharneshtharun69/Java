import java.util.Scanner;
class cuberootofanumusingmath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.print("Cube root of "+n+" is:");
        System.out.print(Math.cbrt(n));
    }
}
