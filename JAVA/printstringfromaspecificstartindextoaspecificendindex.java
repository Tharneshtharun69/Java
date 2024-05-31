import java.util.*;
import java.lang.*;
class printstringfromaspecificstartindextoaspecificendindex
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        System.out.print("Enter start index:");
        int startindex=sc.nextInt();
        System.out.print("Enter end index:");
        int endindex=sc.nextInt();
        System.out.print("The string from "+startindex+" to "+endindex+" is:");
        for(int i=startindex;i<=endindex;i++)
        {
            System.out.print(s.charAt(i));
        }
    }
} 
