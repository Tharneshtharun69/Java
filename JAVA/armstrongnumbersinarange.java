class armstrongnumbersinarange{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++)
        {
            int n=i;
            int ori=n;
            int noofdigits=Integer.toString(n).length();
            int sum=0;
            int r;
            while(n!=0)
            {
                r=n%10;
                sum=sum+(int)Math.pow(r,noofdigits);
                n/=10;
            }
            if(sum==ori)
            {
                System.out.println(ori);
            }
        }
    }
}
