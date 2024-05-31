import java.util.*;
class multiplicationtableinrev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for which you want to print multiplication table in reverse from 20th step to 1st step:");
        int n=sc.nextInt();
        System.out.print("The multiplication table for "+n+" from 20th step to 1st step is:");
        System.out.println();
        for(int i=20;i>=1;i--)
        {
            System.out.println(i+"x"+n+"="+n*i);
        }
    }
}
