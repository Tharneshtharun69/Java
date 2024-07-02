import java.util.Scanner;
class factorialusinganonymousobject
{
  void fact(int n)
  {
    int fact=1;
    for(int i=1;i<=n;i++)
    {
      fact=fact*i;
    }
    System.out.println("factorial is: "+fact);
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    new factorialusinganonymousobject().fact(a);
  }
}
