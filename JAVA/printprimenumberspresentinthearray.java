import java.io.*;
import java.util.*;
class printprimenumberspresentinthearray
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean found=false;
        for(int i=0;i<size;i++)
        {
            int n=arr[i];
            int divisorcount=0;
            for(int j=1;j<=n;j++)
            {
                if(n%j==0)
                {
                    divisorcount++;
                }
            }
            boolean printed=false;
            if(divisorcount==2)
            {
                found=true;
                System.out.print(arr[i]+" ");
            }
        }
        if(found==false)
        {
            System.out.println("There are no prime numbers in the array.");
        }
    }
}