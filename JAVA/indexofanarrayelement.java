import java.util.*;
class indexofanarrayelement
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
        System.out.println("Enter the element for which you want to find the index:");
        int find=sc.nextInt();
        boolean found=false;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==find)
            {
                System.out.println("The element was found at the position "+i+" in the array");
                found=true;
                break;
            }
        }
        if(found==false)
        {
            System.out.println("The element was not found in the array");
        }
    }
}
