import java.util.Scanner;
class firstnonrepeatingCharacterinastring{
  public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int n=s.length();
    for(int i=0;i<n;i++){
      char curr=s.charAt(i);
      if(s.indexOf(curr)==s.lastIndexOf(curr)){
        System.out.print(curr);
        break;
      }
    }
  }
}
