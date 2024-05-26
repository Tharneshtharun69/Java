import java.util.Scanner;
class storeelementsalternatelyinanarrayandprintthearray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element 1:");
        int n1=sc.nextInt();
        System.out.println("Enter the element 2:");
        int n2=sc.nextInt();
        for(int i=0;i<size;i++)
        { 
            if(i%2==0)
            {
                arr[i]=n1;
            }
            else
            {
                arr[i]=n2;
            }
        }
        System.out.println("After storing the elements alternately in the array,the array is:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
