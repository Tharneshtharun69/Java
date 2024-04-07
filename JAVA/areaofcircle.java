import java.util.Scanner;
class areaofcircle
{
public static void main(String args[])
{
int r;
float area;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of the circle:");
r=sc.nextInt();
area=(22*r*r)/7;
System.out.println("The area of the circle is:"+area);
}
}