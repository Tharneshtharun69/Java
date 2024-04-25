import java.util.*;
class printevennumbersinarangewithoutmodulooperator{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("The even numbers from 1 to "+n+" are:");
        for (int i = 2; i <= n; i=i + 2) {
            System.out.print(i + " ");
        }
    }
}
