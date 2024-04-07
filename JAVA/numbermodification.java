import java.util.Scanner;
public class numbermodification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int originalNumber = scanner.nextInt();
        if (originalNumber < 1000 || originalNumber > 9999) {
            System.out.println("Please enter a valid 4-digit number.");
            return;
        }
        int digit1 = (originalNumber % 10000) / 1000;
        int digit2 = (originalNumber % 1000) / 100;
        int digit3 = (originalNumber % 100) / 10;
        int digit4 = originalNumber % 10;
        int modifiedDigit1 = (digit1 + 2) % 10;
        int modifiedDigit2 = (digit2 + 2) % 10;
        int modifiedDigit3 = (digit3 + 2) % 10;
        int modifiedDigit4 = (digit4 + 2) % 10;
        int modifiedNumber = modifiedDigit1 * 1000 + modifiedDigit2 * 100 + modifiedDigit3 * 10 + modifiedDigit4;
        System.out.println("Modified number: " + modifiedNumber);
    }
}
