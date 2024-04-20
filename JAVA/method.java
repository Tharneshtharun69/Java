import java.util.*;
class method{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        method m=new method();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println("The sum is:");
        m.add(a,b);
    }
}
