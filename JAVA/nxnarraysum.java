import java.io.*;
import java.util.*;
public class nxnarraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                int val=sc.nextInt();
                sum=sum+val;
            }
        }
        System.out.print(sum);
    }
}
