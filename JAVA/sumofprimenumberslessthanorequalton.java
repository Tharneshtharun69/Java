class sumofprimenumberslessthanorequalton{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
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
                sum+=i;
            }
        }
        System.out.println("Sum of prime numbers upto n is:"+sum);
    }
}
