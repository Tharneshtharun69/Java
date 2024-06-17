import java.util.Scanner;
class consonantcountinastring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        int consonantcount=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u'&&s.charAt(i)!='A'&&s.charAt(i)!='E'&&s.charAt(i)!='I'&&s.charAt(i)!='O'&&s.charAt(i)!='U'&&s.charAt(i)!=' ')
            {
                consonantcount++;
            }
        }
        System.out.print("There are "+consonantcount+" consonants in the string");
    }
}
