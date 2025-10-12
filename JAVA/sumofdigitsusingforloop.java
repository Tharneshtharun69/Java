import java.util.*;
class sumofdigitsusingforloop
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String str=Integer.toString(num);
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            int a=Integer.parseInt(String.valueOf(str.charAt(i)));
            sum+=a;
        }
        System.out.print(sum);
    }
}
