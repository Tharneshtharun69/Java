import java.util.Scanner;
class maximumelementinarrayusingmethod{
    public static int maxelementinarray(int arr[],int size){
        int max=arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        maximumelementinarrayusingmethod m=new maximumelementinarrayusingmethod();
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
        System.out.println();
        System.out.println("The maximum element of the array is:");
        System.out.print(m.maxelementinarray(arr,size));
    }
}
