import java.util.*;
class productofarrayelements{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        int prod=1;
        System.out.println("Enter the array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            prod=prod*arr[i];
        }
        System.out.println("Product of the array elements is: "+prod);
    }
}
