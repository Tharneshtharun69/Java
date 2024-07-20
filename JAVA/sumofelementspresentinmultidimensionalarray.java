import java.util.Scanner;
class sumofelementspresentinmultidimensionalarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int rows=sc.nextInt();
        System.out.print("Enter the no of columns:");
        int columns=sc.nextInt();
        int arr[][]=new int[rows][columns];
        System.out.print("Enter the "+rows*columns+" elements of the array:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("The multidimensional array is:");
        System.out.println();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                sum=sum+arr[i][j];
            }
        }
        System.out.print("Sum of elements present in the multidimensional array is:");
        System.out.print(sum);
    }
}
