import java.util.Scanner;
class missingnumberinanarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,6};//change this array as needed
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
        int missing=expectedsum-actualsum;
        System.out.print("The missing number in the array is:");
        System.out.print(missing);
    }
}
