import java.util.*;
class exceptionexampleforfinally
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    try{
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println(a/b);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    finally{
      System.out.println("Thanks");
    }
  }
}
