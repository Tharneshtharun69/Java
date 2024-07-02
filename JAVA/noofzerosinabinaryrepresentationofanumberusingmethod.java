import java.util.*;
class noofzerosinabinaryrepresentationofanumberusingmethod{
    public static int noofzerosinabinaryrepresentationofanumber(int n) {
        String binary=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<binary.length();i++)
        {
            if(binary.charAt(i)=='0')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.print(noofzerosinabinaryrepresentationofanumberusingmethod(n));
    }
}
