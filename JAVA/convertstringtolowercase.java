import java.util.*;
import java.lang.*;
class convertstringtolowercase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string in uppercase:");
        String s=sc.nextLine();
        System.out.print("The string in lowercase is:");
        System.out.println();
        System.out.print(s.toLowerCase());
    }
} 
