import java.util.*;
class printuptofirstnthindexelementsofarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Upto which index you want to print the array elements?");
        int n=sc.nextInt();
        if(n>=size)
        {
            System.out.print("Error!Array index out of bound exception!");
        }
        else
        {
            System.out.println("The elements upto index "+n+" are:");
            for(int i=0;i<=n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
