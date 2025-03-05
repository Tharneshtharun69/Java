import java.util.*;
class removeduplicatecharacterspresentinstringfromthelastofstringusingstack{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!stack.contains(s.charAt(i)))
            {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        String afterremove=sb.toString();
        StringBuilder rever=new StringBuilder();
        for(int i=afterremove.length()-1;i>=0;i--)
        {
            rever.append(afterremove.charAt(i));
        }
        System.out.print(rever.toString());
    }
}
