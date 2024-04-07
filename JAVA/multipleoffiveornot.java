import java.util.Scanner;
class multipleoffiveornot
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for n:");
int n=sc.nextInt();
if(n%5==0)
{
System.out.println("The given number is a multiple of 5");
}
else
{
System.out.println("The given number is not a multiple of 5");
}
}
}