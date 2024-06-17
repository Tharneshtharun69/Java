import java.util.Scanner;
class stringreverseusingwhileloop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        int i=s.length()-1;
        System.out.print("The reversed string is:");
        while(i>=0)
        {
            System.out.print(s.charAt(i));
            i--;
        }
    }
}
