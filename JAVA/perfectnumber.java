import java.util.Scanner;
class perfectnumberornot//ifsumofdivisorsequalssamenoitisperfectnumber
{
   public static void  main(String[] args){
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int i;
       int sum=0;
       for(i=1;i<=N;i++)
       {
           if(N%i==0)
           {
               sum=sum+i;
           }
       }
       if(sum==N)
       {
           System.out.println("Yes");
       }
       else
       {
           System.out.println("No");
       }
   }
}
