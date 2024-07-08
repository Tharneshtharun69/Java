import java.util.*;
class secondmaximumelementinanarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int secondmax=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==max)
            {
                i++;
            }
            else
            {
                secondmax=arr[i];
            }
        }
        System.out.println("Second max element of the array is: "+secondmax);
    }
}