import java.util.*;
class convertintegertobinarystring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int n=sc.nextInt();
        String s=Integer.toBinaryString(n);
        System.out.print("Binary string is:");
        System.out.print(s);
    }
}
