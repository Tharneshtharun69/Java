import java.util.Scanner;
class commonelementsbetweentwoarrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of arr:");
        int size1=sc.nextInt();
        int arr[]=new int[size1];
        System.out.print("Enter the size of brr:");
        int size2=sc.nextInt();
        int brr[]=new int[size2];
        System.out.print("Enter the elements of arr:");
        for(int i=0;i<size1;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the elements of brr:");
        for(int i=0;i<size2;i++)
        {
            brr[i]=sc.nextInt();
        }
        System.out.print("The common elements present in the arr and brr are:");
        System.out.println();
        for(int i=0;i<size1;i++)
        {
            for(int j=0;j<size2;j++)
            {
                if(arr[i]==brr[j])
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
