import java.util.*;
class ChangeAllOccurrencesOfANumberInArrayWithANewNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number which needs to be changed:");
        int needToChange = sc.nextInt();
        System.out.println("Enter the new number:");
        int newNumber = sc.nextInt();
        boolean found = false;  
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == needToChange) {
                arr[i] = newNumber;
                found = true;  
            }
        }
        if (!found) {
            System.out.println("Element not found in array"); 
        } else {
            System.out.println("After changing the elements, the array is:");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
