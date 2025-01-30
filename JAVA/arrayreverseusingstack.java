// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class arrayreverseusingstack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        Stack stack=new Stack<>();
        while(stack.isEmpty())
        {
            for(int i=0;i<arr.length;i++)
            {
                stack.push(arr[i]);
            }
        }
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }
    }
}
