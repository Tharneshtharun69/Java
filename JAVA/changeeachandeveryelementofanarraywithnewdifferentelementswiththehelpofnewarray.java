import java.util.*;
class changeeachandeveryelementofanarraywithnewdifferentelementswiththehelpofnewarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        System.out.println("Enter the "+size+" elements of the array 1:");
        for(int i=0;i<size;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("The elements present in the array 1 are:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        int arr2[]=new int[size];
        System.out.println();
        System.out.println("Enter the "+size+" elements of the array 2:");
        for(int i=0;i<size;i++)
        {
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            arr1[i]=arr2[i];
        }
        System.out.println("After changing the array elements,the elements present in the array 1 is:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
