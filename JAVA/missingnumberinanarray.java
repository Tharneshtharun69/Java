import java.util.Scanner;
class missingnumberinanarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int expectedsum=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        for(int i=min;i<=max;i++)
        {
            expectedsum=expectedsum+i;
        }
        int actualsum=0;
        for(int i=0;i<arr.length;i++)
        {
            actualsum=actualsum+arr[i];
        }
        int missing=Math.max(expectedsum,actualsum)-Math.min(expectedsum,actualsum);
        System.out.print("The missing number in the array is:");
        System.out.print(missing);
    }
}
