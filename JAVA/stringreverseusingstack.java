class stringreverseusingstack{
    public static void main(String[] args) {
        String a="Hello world";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<a.length();i++)
        {
            stack.push(a.charAt(i));
        }
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
    }
}
