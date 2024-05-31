import java.util.Scanner;
class arrayindexoutofboundexception
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("The array is:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter an index which is out of range:");
        int index=sc.nextInt();
        System.out.print(arr[index]);
    }
}
