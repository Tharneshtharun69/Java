import java.util.*;
class sumofnumbersfromatob{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start value:");
        int start=sc.nextInt();
        System.out.println("Enter the last value");
        int end=sc.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of numbers from "+start+" to "+end+" is: "+sum);
    }
}