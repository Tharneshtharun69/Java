import java.util.*;
class printevennumbersseparatedbycommas {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no:");
        int n = sc.nextInt();
        if (n >= 2)
            System.out.print("2");
        for (int i = 4; i <= n; i = i + 2) {
            System.out.print("," + i);
        }
    }
}