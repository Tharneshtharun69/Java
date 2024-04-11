import java.util.*;
class arrayreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Reversed array is:");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j]+" ");
        }
    }
}
