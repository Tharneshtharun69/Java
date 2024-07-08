import java.util.*;
class Arraylistreverse
{
  public static void main(String args[])
  {
    ArrayList obj=new ArrayList();
    obj.add("Tokyo");
    obj.add("Rio");
    obj.add("Helsinki");
    obj.add("Oslo");
    for(int i=obj.size()-1;i>=0;i--)
    {
      System.out.print(obj.get(i)+" ");
    }
  }
}
