import java.util.Scanner;
public class Primenumber
{
   public static void main(String[] args)
   {
      int num, i, count=0;
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      num = s.nextInt();
      if(num%1==0)
      {
          count++;
      }
      for(i=2;i<num;i++)
      {
         if(num%i!=0)
         {
            count++;
            break;
         }
      }
      if(count==2)
         System.out.println("\nIt's a Prime Number.");
      else
         System.out.println("\nIt's not a Prime Number.");
   }
}
