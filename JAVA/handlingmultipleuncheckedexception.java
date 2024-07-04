import java.util.*;
class handlingmultipleuncheckedexception
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    try {
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println(a/b);
    } 
    catch(InputMismatchException e) {
      System.out.println("Fool");
    }
    catch(ArithmeticException e){
      System.out.println("Idiot");
    }
    System.out.println("Welcome to our class");
  }
}
