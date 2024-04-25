import java.util.*;
class printelementsfromspecificstartindextoendindex
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
        System.out.println("from which index you want to print the array elements?");
        int startindex=sc.nextInt();
        System.out.println("upto which index you want to print the array elements?");
        int endindex=sc.nextInt();
        System.out.println("The elements from "+startindex+" to "+endindex+" index are:");
        for(int i=startindex;i<=endindex;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
