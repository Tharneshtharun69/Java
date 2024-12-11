import java.util.*;
public class findpalindromicnumberspresentinarray
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the size of the array:");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    boolean found=false;
	    System.out.print("Enter the elements of the array:");
	    for(int i=0;i<size;i++)
	    {
	      arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<size;i++)
	    {
	        int n=arr[i];
	        int ori=n;
	        int r;
	        int rev=0;
	        while(n!=0)
	        {
	            r=n%10;
	            rev=(rev*10)+r;
	            n/=10;
	        }
	        if(ori==rev)
	        {   
	            found=true;
	            System.out.print(ori+" ");
	        }
	    }
	    if(found==false)
	    {
	        System.out.print("There are no palindromic numbers in the array");
	    }
	}
}
