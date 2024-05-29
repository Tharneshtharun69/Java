import java.util.Scanner;
class checkwhetheranelementexistornotinanarray
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
        System.out.print("The array is:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the element to be searched:");
        int check=sc.nextInt();
        boolean found=false;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==check)
            {
                found=true;
                break;
            }
            else
            {
                found=false;
            }
        }
        if(found==true)
        {
            System.out.print("Element found in the array");
        }
        else
        {
            System.out.print("Element not found in the array");
        }
    }
}
