import java.util.*;
class checkwhetherastringexistassubstringinanotherstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String a=sc.nextLine();
        System.out.print("Enter the substring which has to be searched:");
        String sub=sc.nextLine();
        boolean exist=false;
        for(int i=0;i<a.length();i++)
        {
            for(int j=i+sub.length();j<a.length();j++)
            {
                if(a.substring(i,j).equals(sub))
                {
                    exist=true;
                }
            }
        }
        if(exist==true)
        {
            System.out.print("The string "+sub+" exist as Substring in the string "+a);
        }
        else
        {
            System.out.print("The string "+sub+" not exist as Substring in the string "+a);
        }
    }
}