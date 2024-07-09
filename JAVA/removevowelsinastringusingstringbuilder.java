import java.util.Scanner;
class removevowelsinastringusingstringbuilder
{
  public static void main (String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u'&&s.charAt(i)!='A'&&s.charAt(i)!='E'&&s.charAt(i)!='I'&&s.charAt(i)!='O'&&s.charAt(i)!='U')
      {
        sb.append(s.charAt(i));
      }
    }
    String a=sb.toString();
    System.out.print(a);
  }
}
