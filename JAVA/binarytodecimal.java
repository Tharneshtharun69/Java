import java.util.*;
class binarytodecimal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a binary value:");
        String s=sc.nextLine();
        int decimal=Integer.parseInt(s,2);
        System.out.print(decimal);
    }
}
