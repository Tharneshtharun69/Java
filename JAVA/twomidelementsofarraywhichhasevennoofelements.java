import java.util.*;
class twomidelementsofarraywhichhasevennoofelements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an even number which is the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements of the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The two mid elements of the array are:");
        System.out.println(arr[((size)/2)-1]+" "+arr[((size)/2)]);
    }
}
