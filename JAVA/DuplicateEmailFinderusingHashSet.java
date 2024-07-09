import java.util.HashSet;
import java.util.Scanner;
public class DuplicateEmailFinderusingHashSet{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashSet<String> emailSet = new HashSet<>();
        HashSet<String> duplicateEmails = new HashSet<>();
        while (true) {
            String email = sc.nextLine().trim();
            if (email.equalsIgnoreCase("q")) {
                break;
            }
            if (!emailSet.add(email)) {
                duplicateEmails.add(email);
            }
        }
        if (duplicateEmails.isEmpty()) {
            System.out.println("No duplicate emails found.");
        } 
        else {
            System.out.println("Duplicate email IDs:");
            for (String email : duplicateEmails) {
                System.out.println(email);
            }
        }
    }
}
