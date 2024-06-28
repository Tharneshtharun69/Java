import java.util.Scanner;
public class FindFirstNonRepeatingCharacterinaString{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = scanner.nextLine();
    int firstNonRepeatingIndex = -1;
    char firstNonRepeatingChar = '\0';
    for (int i = 0; i < str.length(); i++) {
      char currentChar = str.charAt(i);
      boolean isRepeating = false;
      for (int j = 0; j < str.length(); j++) {
        if (i != j && currentChar == str.charAt(j)) {
          isRepeating = true;
          break;
        }
      }
      if (!isRepeating) {
        firstNonRepeatingIndex = i;
        firstNonRepeatingChar = currentChar;
        break;
      }
    }
    if (firstNonRepeatingIndex == -1) {
      System.out.println("All characters are repeating.");
    } else {
      System.out.println("First non-repeating character: " + firstNonRepeatingChar);
    }
  }
}
