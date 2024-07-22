import java.util.Scanner;
class secondmaximumelementofthearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int max=arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int secondmax=arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[i]<max&&arr[i]>secondmax)
            {
                secondmax=arr[i];
            }
        }
        System.out.println();
        System.out.println("Second maximum element of the array is:");
        System.out.println(secondmax);
    }
}