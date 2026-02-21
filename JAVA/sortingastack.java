import java.util.*;
class sortingastack
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements:");
        int num=sc.nextInt();
        System.out.print("Enter the elements:");
        Stack<Integer> a=new Stack<>();
        for(int i=0;i<num;i++)
        {
            int n=sc.nextInt();
            a.push(n);
        }
        Stack<Integer> b=new Stack<>();
        while(!a.isEmpty())
        {
            int n=a.pop();
            while(!b.isEmpty() && b.peek()>n)
            {
                a.push(b.pop());
            }
            b.push(n);
        }
        Stack<Integer> c=new Stack<>();
        while(!b.isEmpty())
        {
            c.push(b.pop());
        }
        System.out.print("The sorted stack is:");
        while(!c.isEmpty())
        {
            System.out.print(c.pop()+" ");
        }
    }
}
