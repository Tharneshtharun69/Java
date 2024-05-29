import java.util.*;
class minimumvalueofanarrayusingwhileloop
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
        System.out.print("Minimum value of the array is:");
        int k=0;
        int min=arr[0];
        while(k<size)
        {
            if(arr[k]<min)
            {
                min=arr[k];
            }
            k++;
        }
        System.out.print(min);
    }
}
