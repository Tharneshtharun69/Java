import java.util.Scanner;
class oddorevenwithoutmodulus
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int answer=n/2;
if(answer*2==n)
{
System.out.println("The number is even");
}
else
{
System.out.println("The number is odd");
}
}
}
