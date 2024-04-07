import java.util.*;
class sumoffirstandsecondlastdigitofafivedigitnumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int d5=n%10;
int d4=n/10%10;
int d3=n/100%10;
int d2=n/1000%10;
int d1=n/10000%10;
int S=d5+d2;
System.out.println("Required sum is:"+S);
}
}
