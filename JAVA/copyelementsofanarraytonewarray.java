import java.util.Scanner;
class copyelementsofanarraytonewarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int oriarr[]=new int[size];
        int copiedarr[]=new int[size];
        System.out.println("Enter the "+size+" elements of the original array:");
        for(int i=0;i<size;i++)
        {
            oriarr[i]=sc.nextInt();
        }
        System.out.println("The elements present in the original array are:");
        for(int i=0;i<size;i++)
        {
            System.out.print(oriarr[i]+" ");
        }
        for(int i=0;i<size;i++)
        {
            copiedarr[i]=oriarr[i];
        }
        System.out.println();
        System.out.println("After copying the elements from original array to copied array,the copied array is:");
        for(int i=0;i<size;i++)
        {
            System.out.print(copiedarr[i]+" ");
        }
    }
}
