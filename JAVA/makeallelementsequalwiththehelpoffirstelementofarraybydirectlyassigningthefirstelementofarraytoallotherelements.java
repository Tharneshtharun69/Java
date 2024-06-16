import java.util.Scanner;
class makeallelementsequalwiththehelpoffirstelementofarraybydirectlyassigningthefirstelementofarraytoallotherelements
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
        System.out.println("The original array is:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<size;i++)
        {
            arr[i]=arr[0];
        }
        System.out.println("After making all elements equal with the help of the first element of the array,the array is:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
