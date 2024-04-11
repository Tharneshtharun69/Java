import java.util.*;
public class sumofarrayelements{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter array size:");
    int size=sc.nextInt();
    int array[]=new int[size];
    int sum=0;
    int i=0;
    System.out.print("Enter array elements:");
    for(i=0;i<array.length;i++)
    {
      array[i]=sc.nextInt();
    }
    for(i=0;i<array.length;i++)
    {
      sum=sum+array[i];
    }
    System.out.print("Sum of array elements is:"+sum);
  }
}
