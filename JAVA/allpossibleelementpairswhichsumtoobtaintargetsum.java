import java.util.Scanner;
class allpossibleelementpairswhichsumtoobtaintargetsum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("The array is:");
        System.out.println();
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the targetsum:");
        int targetsum=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==targetsum)
                {
                    if(!found)
                    {
                        System.out.println("All possible element pairs which sum to obtain target sum: ");
                        found=true;
                    }
                    System.out.println(arr[i]+" "+arr[j]);
                    System.out.println(arr[j]+" "+arr[i]);
                }
            }
        }
        if(found==false)
        {
            System.out.print("No possible element pairs found which sum to obtain target sum");
        }
    }
}
