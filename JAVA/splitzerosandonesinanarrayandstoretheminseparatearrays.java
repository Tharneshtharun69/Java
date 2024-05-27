import java.util.Scanner;
class splitzerosandonesinanarrayandstoretheminseparatearrays
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the original array:");
        int sizeoforiarray=sc.nextInt();
        int oriarr[]=new int[sizeoforiarray];
        int countofzeros=0;
        int countofone=0;
        System.out.println("Enter the elements of original array with only zeros and ones:");
        for(int i=0;i<sizeoforiarray;i++)
        {
            oriarr[i]=sc.nextInt();
        }
        for(int i=0;i<sizeoforiarray;i++)
        {
            if(oriarr[i]==0)
            { 
                countofzeros++;
            }
            else
            {
                countofone++;
            }
        }
        int zeroarr[]=new int[countofzeros];
        int onearr[]=new int[countofone];
        for(int i=0;i<countofzeros;i++)
        {
            zeroarr[i]=0;
        }
        for(int i=0;i<countofone;i++)
        {
            onearr[i]=1;
        }
        System.out.print("Zero array is:");
        System.out.println();
        for(int i=0;i<countofzeros;i++)
        {
            System.out.print(zeroarr[i]+" ");
        }
        System.out.println();
        System.out.println("One array is:");
        for(int i=0;i<countofone;i++)
        {
            System.out.print(onearr[i]+" ");
        }
    }
}
