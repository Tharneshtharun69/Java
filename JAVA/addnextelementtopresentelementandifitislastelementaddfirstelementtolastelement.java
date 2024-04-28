import java.util.*;
class addnextelementtopresentelementandifitislastelementaddfirstelementtolastelement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the " + size + " elements of the array:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) 
        {
            if (i < size - 1) 
            {
                arr[i] = arr[i] + arr[i + 1];
            } else 
            {
                arr[i] = arr[i] + arr[0];
            }
        }
        System.out.println("After adding next elements to the current element and if it is last element, adding first element of the array to the last element, the array is:");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
