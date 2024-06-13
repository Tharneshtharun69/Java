import java.util.Scanner;
class cubewithoutusingmath
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for a for which you want to find the cube:");
int a=sc.nextInt();
int cube=a*a*a;
System.out.println("The cube of"+" "+a+" "+"is:"+cube);
}
}

