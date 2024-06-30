import java.util.Scanner;
class typeconversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.print("Float value is:");
        float f=(float)n;
        System.out.println(f);
        System.out.print("double value is:");
        double d=(double)n;
        System.out.println(d);
        System.out.print("long value is:");
        long l=(long)n;
        System.out.println(l);
        System.out.print("byte value is:");
        byte b=(byte)n;
        System.out.println(b);
        System.out.print("Enter a float value:");
        float a=sc.nextFloat();
        int i=(int)a;
        System.out.print("Integer value is:");
        System.out.println(i);
        System.out.print("Binary value is:");
        System.out.print(Integer.toBinaryString(n));
    }
}
