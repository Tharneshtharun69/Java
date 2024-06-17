import java.util.*;
class whileloop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int i=0;
        while(i<n){
            System.out.print(i+" ");
            i++;
        }
    }
}
