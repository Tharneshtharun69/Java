import java.util.*;
class addnextelementtopresentelementandifitislastelementaddzerotolastelement
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
        for(int i=0;i<size;i++)
        {
            if(i<size-1)
            {
                arr[i]=arr[i]+arr[i+1];
            }
            else
            {
                arr[i]=arr[i]+0;
            }
        }
        System.out.println("After adding next elements to the current element to the all elements present in the array and if it is last element add zero to last element,the array is:");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
