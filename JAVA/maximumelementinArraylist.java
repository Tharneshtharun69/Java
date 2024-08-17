import java.util.Scanner;
import java.util.ArrayList;
class maximumelementinArraylist
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            int n=sc.nextInt();
            a.add(n);
        }
        int max=0;
        int index=0;
        for(int i:a)
        {
            if(a.get(i)>max)
            {
                max=a.get(i);
            }
        }
        System.out.print("Maximum element in the arraylist is:");
        System.out.print(max);
    }
}
