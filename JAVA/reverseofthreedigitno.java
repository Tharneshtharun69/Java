import java.util.*;
class reverseofthreedigitno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:");
int n=sc.nextInt();
int reversed=0;
while(n!=0)
{
int digit=n%10;
reversed=reversed*10+digit;
n/=10;
}
System.out.println("Reversed no:"+reversed);
}
}