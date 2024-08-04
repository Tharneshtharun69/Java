import java.util.Scanner;
class stringreverseusingmethod{
    public static String stringreverse(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        System.out.println("The reversed string is:");
        System.out.print(stringreverse(s));
    }
}
