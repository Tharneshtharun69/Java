import java.util.*;
class removeduplicatecharacterspresentinstringusingstack{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
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
        System.out.print(afterremove);
    }
}
