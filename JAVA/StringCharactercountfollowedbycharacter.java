import java.util.Scanner;
class StringCharactercountfollowedbycharacter
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuffer sb=new StringBuffer();
    int count=1;
    for(int i=1;i<=s.length();i++)
    {
      if(i==s.length()||s.charAt(i)!=s.charAt(i-1))
      {
        sb.append(s.charAt(i-1)).append(count);
        count=1;
      }
      else
      {
        count++;
      }
    }
    System.out.print(sb);
  }
}
