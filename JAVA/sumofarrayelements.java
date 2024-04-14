import java.util.*;
class sumofarrayelements{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        int sum=0;
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
            sum=sum+arr[i];
        }
        System.out.println("Sum of the array is: "+sum);
    }
}
