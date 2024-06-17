import java.util.*;
class dowhileloop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int i=0;
        do{
            System.out.print(i+" ");
            i++;
        }
        while(i<n);
    }
}
