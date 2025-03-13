import java.util.*;
class sumofdigitsofnumuntilnbecomessingledigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int r;
        if(n>9)
        {
            while(n!=0)
            {
                r=n%10;
                sum=sum+r;
                n/=10;
            }
        }
        if(sum<9)
        {
            System.out.print(sum);
        }
        else
        {
            int asum=0;
            while(sum!=0)
            {
                r=sum%10;
                asum=asum+r;
                sum/=10;
            }
            System.out.print(asum);
        }
    }
}
