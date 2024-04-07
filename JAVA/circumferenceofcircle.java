import java.util.Scanner;
class circumferenceofcircle
{
public static void main(String args[])
{
double circumference;
int radius;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for radius:");
radius=sc.nextInt();
circumference=2*3.14*radius;
System.out.println("The circumference of the circle is:"+circumference);
}
}
