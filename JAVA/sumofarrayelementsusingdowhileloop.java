import java.util.Scanner;
class sumofarrayelementsusingdowhileloop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the "+n+" array elements:");
        int i=0;
        while(i<n)
        {
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.print("The elements present in the array are:");
        int j=0;
        while(j<n)
        {
            System.out.print(arr[j]+" ");
            j++;
        }
        System.out.println();
        int k=0;
        int sum=0;
        do{
            sum=sum+arr[k];
            k++;
        }while(k<n);
        System.out.print("The sum of elements present in the array is:"+sum);
    }
}
