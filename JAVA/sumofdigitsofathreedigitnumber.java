import java.util.*;
class sumofdigitsofathreedigitnumber
{
public static void main(String args[])
{
int n,dig,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println('Enter a number:');
n=sc.nextInt();
while(n>0)
{
dig=n%10;
sum=sum+dig;
n=n/10;
}
System.out.println('Sum is:'+sum);
}
}
