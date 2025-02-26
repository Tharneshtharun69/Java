class nextprimeno{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n+1;i>=n;i++)
        {
            int divisorcount=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    divisorcount++;
                }
            }
            if(divisorcount==2)
            {
                System.out.print(i);
                break;
            }
        }
    }
}
