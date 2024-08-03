import java.util.*;
class printnondigitcharactersinastring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String s=sc.nextLine();
        String a=s.toLowerCase();
        System.out.print("The non digit characters in the string are:");
        for(int i=0;i<a.length();i++)
        {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z')
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}
