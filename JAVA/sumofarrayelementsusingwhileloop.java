import java.util.Scanner;
class sumofarrayelementsusingwhileloop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        int i=0;
        while(i<size)
        {
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.println("The elements of the array are:");
        int j=0;
        while(j<size)
        {
            System.out.print(arr[j]+" ");
            j++;
        }
        int k=0;
        int sum=0;
        while(k<size)
        {
            sum=sum+arr[k];
            k++;
        }
        System.out.println();
        System.out.println("THe sum of the array elements is : "+sum);
    }
}
