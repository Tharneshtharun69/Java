import java.util.*;
class checkifarrayissortedornot 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                count+=1;
            }
        }
        if(count==arr.length)
        {
            System.out.print("The Given Array is Sorted");
        }
        else
        {
            System.out.print("The Given Array is Not Sorted");
        }
    }
}
