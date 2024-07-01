import java.util.*;
class armstrongornotusingmethod
{
  public boolean armstrongornot(int n)
  {
    boolean armstrong=false;
    String a=Integer.toString(n);
    int digit=a.length();
    int sum=0;
    int r;
    while(n!=0)
    {
      r=n%10;
      sum=sum+(int)(Math.pow(r,digit));
      n/=10;
    }
    if(n==sum)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      armstrongornotusingmethod a=new armstrongornotusingmethod();
      a.armstrongornot(n);
      if(true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    }
}
