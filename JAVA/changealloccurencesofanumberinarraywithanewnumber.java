import java.util.*;
class changealloccurencesofanumberinarraywithanewnumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number which needs to be changed:");
        int needtochange=sc.nextInt();
        System.out.println("Enter the new number:");
        int newnumber=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==needtochange)
            {
                arr[i]=newnumber;
            }
        }
        System.out.println("After changing the elements,the array is:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
