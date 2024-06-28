import java.util.*;
class stringanagramornot
{
  public static void main (String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    s1=s1.replaceAll(" ","");
    s2=s2.replaceAll(" ","");
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    if(s1.length()!=s2.length())
    {
      System.out.print("Not anagram");
    }
    else
    {
      char[] String1=s1.toCharArray();
      char[] String2=s2.toCharArray();
      Arrays.sort(String1);
      Arrays.sort(String2);
      if(Arrays.equals(String1,String2))
      {
        System.out.print("Anagram");
      }
    }
  }
}
