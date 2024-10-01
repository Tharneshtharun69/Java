import java.util.*;
class movehashtofrontinstring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a="";
        String b="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {
                a+=s.charAt(i);
            }
            else
            {
                b+=s.charAt(i);
            }
        }
        System.out.print(a+b);
    }
}
