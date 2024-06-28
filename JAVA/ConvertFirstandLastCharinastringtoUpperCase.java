import java.util.Scanner;
class ConvertFirstandLastCharinastringtoUpperCase{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (Character.isWhitespace(c)) {
        result.append(c);
      } else {
        if (i == 0) {
          result.append(Character.toUpperCase(c));
        } else if (i == str.length() - 1) {
          result.append(Character.toUpperCase(c));
        } else {
          result.append(c);
        }
      }
    }
    System.out.println(result.toString());
  }
}
