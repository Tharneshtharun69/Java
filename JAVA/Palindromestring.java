import java.util.*;
class Palindromestring {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str = sc.nextLine();
    String reversedStr = "";
    int strLength = str.length();
    for (int i = (strLength - 1); i >=0; --i) {
      reversedStr = reversedStr + str.charAt(i);
    }
    if
(str.toLowerCase().equals(reversedStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
  }
}