import java.util.Scanner;
class checkwhetherthearrayisincreasingordecreasing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean increasing=false;
        boolean decreasing=false;
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the "+size+" elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                decreasing=true;
            }
            else
            {
                increasing=true;
            }
        }
        if(decreasing==true)
        {
            System.out.print("The array is decreasing");
        }
        else
        {
            System.out.print("The array is increasing");
        }
    }
}
