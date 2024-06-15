import java.util.Scanner;
class CountOfEachAndEveryVowelInTheStringWithoutUsingSwitchCase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        int countofa=0;
        int countofe=0;
        int countofi=0;
        int countofo=0;
        int countofu=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='A')
            {
                countofa++;
            }
            else if(ch=='e'||ch=='E')
            {
                countofe++;
            }
            else if(ch=='i'||ch=='I')
            {
                countofi++;
            }
            else if(ch=='o'||ch=='O')
            {
                countofo++;
            }
            else if(ch=='u'||ch=='U')
            {
                countofu++;
            }
        }
        if(countofa==0&&countofe==0&&countofi==0&&countofo==0&&countofu==0)
        {
            System.out.print("There are no vowels present in the string");
        }
        else
        {
            System.out.println("Count of a:"+countofa);
            System.out.println("Count of e:"+countofe);
            System.out.println("Count of i:"+countofi);
            System.out.println("Count of o:"+countofo);
            System.out.println("Count of u:"+countofu);
        }
    }
}
