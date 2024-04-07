import java.util.Scanner;
class areaoftriangle
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int base = sc.nextInt();
int height = sc.nextInt();
float area;
System.out.println("Enter the value for base and height:");
area = 1 / 2 * base * height;
System.out.println("The area of the triangle is:" + area);
}
}