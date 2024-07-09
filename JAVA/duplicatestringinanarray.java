import java.util.Scanner;
class duplicatestringinanarray
{
  public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    String arr[]=new String[size];
    for(int i=0;i<size;i++)
    {
      arr[i]=sc.next();
    }
    for(int i=0;i<size;i++)
    {
      for(int j=i+1;j<size;j++)
      {
        if(arr[i].equals(arr[j]))
        {
          System.out.println(arr[i]);
        }
      }
    }
  }
}
