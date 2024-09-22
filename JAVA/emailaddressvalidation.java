import java.util.*;
public class emailaddressvalidation
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String s=a.toLowerCase();
        boolean number=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                number=true;
            }
        }
        boolean len=false;
        boolean character=false;
        boolean containsatsymbol=false;
        char atsymbol='@';
        if(s.length()>=6 && s.length()<=30)
        {
            len=true;
        }
        int charcount=0;
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)>='a' && s.charAt(j)<='z')
            {
                charcount++;
            }
        }
        if(charcount>0)
        {
            character=true;
        }
        for(int k=0;k<s.length();k++)
        {
            if(s.charAt(k)=='@')
            {
                containsatsymbol=true;
            }
        }
        for(int l=0;l<s.length();l++)
        {
            if(s.charAt(l)>='0' && s.charAt(l)<='9')
            {
                number=true;
            }
        }
        if(containsatsymbol==true && character==true && number==true && len==true)
        {
            System.out.print("Valid Email");
        }
        else
        {
            System.out.print("Not Valid Email");
        }
    }
}
