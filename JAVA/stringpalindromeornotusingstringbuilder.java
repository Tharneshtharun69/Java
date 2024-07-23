import java.util.Scanner;
class stringpalindromeornotusingstringbuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        if(sb.toString().equals(s))
        {
            System.out.print("It is a palindrome string");
        }
        else
        {
            System.out.print("It is not a palindrome string");
        }
    }
}
