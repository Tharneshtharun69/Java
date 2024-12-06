import java.util.*;
class stringcompress
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(i==0)
            {
                sb.append(s.charAt(i));
            }
            else if(i<s.length()-1)
            {
                count++;
            }
        }
        sb.append(count);
        sb.append(s.charAt(s.length()-1));
        System.out.print(sb.toString());
    }
}