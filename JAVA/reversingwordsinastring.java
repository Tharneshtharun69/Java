import java.util.Scanner;
class reversingwordsinastring
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String word[]=s.split(" ");
    StringBuffer rev=new StringBuffer();
    for(int i=0;i<word.length;i++)
    {
      String w=word[i];
      StringBuilder rw=new StringBuilder(" ");
      for(int j=w.length()-1;j>=0;j--)
      {
        rw.append(w.charAt(j));
      }
      rev.append(rw);
    }
    System.out.print(rev);
  }
}
