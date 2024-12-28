import java.util.*;
class quotientandremainderonlyusingrepeatedsubtraction{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dividend=sc.nextInt();
        int divisor=sc.nextInt();
        int noofsubtractions=0;
        while(dividend>=divisor)
        {
            dividend=dividend-divisor;
            noofsubtractions++;
        }
        int quotient=noofsubtractions;
        int remainder=dividend;
        System.out.print("The quotient is: "+quotient+" And the remainder is: "+remainder);
    }
}
