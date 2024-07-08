import java.util.*;
class Arraylist
{
  public static void main(String args[])
  {
    ArrayList<Integer> a=new ArrayList<Integer>();
    a.add(1);
    a.add(2);
    Iterator itr=a.iterator();
    while(itr.hasNext())
    {
      System.out.println(itr.next());
    }
  }
}
