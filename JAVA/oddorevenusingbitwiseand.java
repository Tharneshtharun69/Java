import java.util.Scanner;
class oddorevenusingbitwiseand {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int number=sc.nextInt();
     System.out.println((number & 1) == 0 ? "Even" : "Odd");
    }
}
