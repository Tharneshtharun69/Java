import java.util.*;
import java.lang.*;
class convertstringtouppercase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string in lowercase:");
        String s=sc.nextLine();
        System.out.print("The string in uppercase is:");
        System.out.println();
        System.out.print(s.toUpperCase());
    }
} 
