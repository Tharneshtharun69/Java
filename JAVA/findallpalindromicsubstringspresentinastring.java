class findallpalindromicsubstringspresentinastring
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        boolean found=false;
        List<String> list=new ArrayList<>();
        for(int i=0;i<a.length();i++)
        {
            for(int j=i+1;j<a.length();j++)
            {
                String s=a.substring(i,j);
                StringBuilder sb=new StringBuilder();
                for(int k=s.length()-1;k>=0;k--)
                {
                    sb.append(s.charAt(k));
                }
                if(sb.toString().equals(s))
                {
                    found=true;
                    list.add(sb.toString());
                }
            }
        }
        if(found==false)
        {
            System.out.println("There are no palindromic substrings present in the string");
        }
        else
        {
            System.out.println("The palindromic substrings present in the string are:");
            for(int i=0;i<list.size();i++)
            {
                System.out.println(list.get(i)+" ");
            }
        }
    }
}
