import java.util.*;
class midelementofarrayforbothevenandoddnoofelements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(size%2==0)
        {
            System.out.println("The two mid elements of the array are:");
            System.out.print(arr[((size/2)-1)]+" "+arr[((size/2))]);
        }
        else
        {
            System.out.println("The mid element of the array is:");
            System.out.print(arr[(size/2)]);
        }
    }
}
