import java.util.Scanner;
class square
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for a for which you want to find the square:");
int a=sc.nextInt();
int square=a*a;
System.out.println("The square of"+" "+a+" "+"is:"+square);
}
}
