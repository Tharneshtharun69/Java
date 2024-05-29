import java.util.*;
class arraycontainsthesearchedelementornot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the "+size+" elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("The array is:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the value to be searched:");
        int search=sc.nextInt();
        boolean found=false;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==search)
            {
                found=true;
                System.out.print("Element found at "+i+" th position in the array");
            }
        }
        if(found==false)
        {
            System.out.print("Element not found in the array");
        }
    }
}
