import java.util.*;
class multiplicationtable
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number which you want to print multiplication table:");
int n=sc.nextInt();
int result;
{
for(int i=1;i<=20;i++){
System.out.println(i+"x"+n+"="+n*i);
}
}
}
}
