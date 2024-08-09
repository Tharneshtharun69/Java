import java.util.*;
class reversetheorderofwordsinthestring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        System.out.println("After reversing the order of words in the string,the string is:");
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
