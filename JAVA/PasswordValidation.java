import java.util.Scanner;
public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean number = false;
        boolean upper = false;
        boolean lower = false;
        boolean len = false;
        boolean specialchar = false;
        char specialcharacter[] = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', ','};
        if (s.length() >= 8) {
            len = true;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                upper = true;
            } 
            else if (Character.isLowerCase(ch)) {
                lower = true;
            } 
            else if (Character.isDigit(ch)) {
                number = true;
            }
            for (char special : specialcharacter) {
                if (ch == special) {
                    specialchar = true;
                    break;
                }
            }
        }
        if (len && upper && lower && number && specialchar) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
