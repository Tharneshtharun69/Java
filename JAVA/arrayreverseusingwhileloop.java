import java.util.Scanner;
class arrayreverseusingwhileloop
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
        System.out.println("The original array is:");
        i=0;
        while(i<size)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
        System.out.println("The reversed array is:");
        int j=size-1;
        while(j>=0)
        {
            System.out.print(arr[j]+" ");
            j--;
        }
    }
}
