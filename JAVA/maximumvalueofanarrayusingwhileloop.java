import java.util.*;
class maximumvalueofanarrayusingwhileloop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println();
        System.out.print("Enter the "+size+" elements of the array:");
        int i=0;
        while(i<size)
        {
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.println();
        System.out.print("The array is:");
        int j=0;
        while(j<size)
        {
            System.out.print(arr[j]+" ");
            j++;
        }
        System.out.println();
        System.out.println();
        System.out.println("Maximum value of the array is:");
        int k=0;
        int max=arr[0];
        while(k<size)
        {
            if(arr[k]>max)
            {
                max=arr[k];
            }
            k++;
        }
        System.out.print(max);
    }
}
