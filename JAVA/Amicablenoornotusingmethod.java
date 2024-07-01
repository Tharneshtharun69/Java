import java.util.*;
class Amicablenoornotusingmethod
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int s1=factofNums(num1);
    int s2=factofNums(num2);
    System.out.println((s2==num2&&s2==num1)?"Yes":"No");
  }
  static int factofNums(int num)
  {
      int sum=0;
      for(int i=1;i<num;i++)
      {
        if(num%i==0)
        {
          sum=sum+i;
        }
      }
      return sum;
    }
  }
}
