import java.util.*;
class averageofallpositivelementsinanarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int positivecount=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]>0)
            {
                positivecount++;
            }
        }
        int sum=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]>0)
            {
                sum=sum+arr[i];
            }
        }
        int average=sum/positivecount;
        System.out.print("The average of all positive elements in the array is:");
        System.out.print(average);
    }
}
