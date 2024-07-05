import java.util.Scanner;
class gcdoftwonumbersusingforloop
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int b=sc.nextInt();
    int max=0;
    if(n>b)
    {
      max=n;
    }
    else
    {
      max=b;
    }
    int gcd=0;
    for(int i=1;i<=max;i++)
    {
      if(n%i==0 && b%i==0)
      {
        gcd=i;
      }
    }
    System.out.println(gcd);
  }
}
