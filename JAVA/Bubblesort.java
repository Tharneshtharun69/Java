import java.util.*;
class Bubblesort {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];
    int temp;
    for(int i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++)
    {
      for(int j=i+1;j<size;j++)
      {
        if(arr[i]>arr[j])
        {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    for(int i=0;i<size;i++)
    {
      System.out.print(arr[i]);
      if(i<size-1)
      {
        System.out.print(" ");
      }
    }
  }
}
