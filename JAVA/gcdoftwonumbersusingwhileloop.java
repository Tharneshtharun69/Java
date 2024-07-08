import java.util.*;
class gcdoftwonumbersusingwhileloop
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int max=0;
    if(a>b)
    {
      max=a;
    }
    else
    {
      max=b;
    }
    int gcd=0;
    int i=1;
    while(i<=max)
    {
      if(a%i==0 && b%i==0)
      {
        gcd=i;
      }
      i++;
    }
    System.out.println(gcd);
  }
}
