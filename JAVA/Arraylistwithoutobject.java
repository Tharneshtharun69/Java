import java.util.*;
class Arraylistwithoutobject
{
  public static void main(String args[])
  {
    ArrayList obj=new ArrayList();
    obj.add(1);
    obj.add(2);
    Iterator itr=obj.iterator();
    while(itr.hasNext())
    {
      System.out.println(itr.next());
    }
  }
}
