import java.util.*;
class noisaperfectsquareornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        boolean isperfect=false;
        for(int i=1;i<=n;i++)
        {
            if((i*i)==n)
            {
                isperfect=true;
                break;
            }
        }
        if(isperfect==true)
        {
            System.out.print(n+" is a perfect square");
        }
        else
        {
            System.out.print(n+" is not a perfect square");
        }
    }
}