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
        int startindex=sc.nextInt();
        int endindex=sc.nextInt();
        for(int i=startindex;i<=endindex;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
