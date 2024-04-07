import java.util.Scanner;
public class printnoofdigitsinanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = n.toCharArray();
        System.out.println(arr.length);
    }
}