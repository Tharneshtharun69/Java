import java.util.Scanner;
class pairsofarraywhichhavetargetsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int targetsum = sc.nextInt();
        System.out.println("Pairs with a sum of " + targetsum + " are :");
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == targetsum) {
                    System.out.println("["+nums[i] + ", " + nums[j]+"]");
                }
            }
        }
    }
}
