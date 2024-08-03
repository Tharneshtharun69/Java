import java.util.*;
class Stringreverseusingmethod{
    public static String stringreverse(String s)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String s=sc.nextLine();
        System.out.print("The reverse of the string is:");
        System.out.print(stringreverse(s));
    }
}
