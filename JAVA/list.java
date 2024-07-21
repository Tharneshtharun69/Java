import java.util.*;
class list
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        System.out.print("Enter the size of the list:");
        int size=sc.nextInt();
        System.out.print("Enter the elements of the list:");
        for(int i=0;i<size;i++)
        {
            int n=sc.nextInt();
            list.add(n);
        }
        System.out.print("The list is:");
        for(int i=0;i<size;i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
