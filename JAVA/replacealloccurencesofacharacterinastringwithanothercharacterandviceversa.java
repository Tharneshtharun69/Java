import java.util.*;
class replacealloccurencesofacharacterinastringwithanothercharacterandviceversa
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        System.out.println("Enter the character that is present in the string that needs to be replaced with another character:");
        char a=sc.nextLine().charAt(0);
        char b=sc.nextLine().charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==a)
            {
                sb.append(b);
            }
            else if(s.charAt(i)==b)
            {
                sb.append(a);
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        System.out.print("After replacing the string is:");
        System.out.print(sb.toString());
    }
}
