import java.util.*;
class fahrenheitintocelsius
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int fahrenheit=sc.nextInt();
double celsius=((fahrenheit-32)*5)/9;
System.out.println(celsius);
}
}
