import java.util.*;
class countofoddandevenelementspresentinthearray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements present in the array are:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int countofodd=0;
        int countofeven=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]%2==0)
            {
                countofeven++;
            }
            else
            {
                countofodd++;
            }
        }
        System.out.println();
        System.out.println("Count of odd elements present in the array is: "+countofodd);
        System.out.println("Count of even elements present in the array is: "+countofeven);
    }
}
