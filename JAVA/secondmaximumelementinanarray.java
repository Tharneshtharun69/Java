import java.util.Scanner;
class secondmaxelementinthearray
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("The array is:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int max=arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int secondmax=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==max)
            {
                continue;
            }
            else if(arr[i]>secondmax)
            {
                secondmax=arr[i];
            }
            else
            {
                i++;
            }
        }
        System.out.println();
        System.out.print("The second maximum element of the array is:");
        System.out.print(secondmax);
    }
}
