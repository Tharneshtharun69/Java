import java.util.*;
class gcdoftwonumbersusingdowhile{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int max=0;
      int gcd=0;
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(a>b)
      {
          max=a;
      }
      else
      {
          max=b;
      }
      int i=1;
      do{
        if(a%i==0 && b%i==0)
        {
          gcd=i;
        }
        i++;
      }while(i<=max);
      System.out.println(gcd);
    }
}
