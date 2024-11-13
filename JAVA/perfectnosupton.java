import java.util.*;
class perfectnosupton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        for (int i = 1; i <= end; i++) {
            int sum = 0;
            int n = i;
            for (int j = 1; j < n; j++) {
                if (n % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == n) {
                System.out.print(i + " ");
            }
        }
    }
}
