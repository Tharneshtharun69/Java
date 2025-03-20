class primefactorsofanumber{
    public static boolean isprime(int a){
        boolean prime=false;
        int divisorcount=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                divisorcount++;
            }
        }
        if(divisorcount==2)
        {
            prime=true;
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> primefactors=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                int a=i;
                boolean primeornot=isprime(a);
                if(primeornot==true)
                {
                    primefactors.add(a);
                }
            }
        }
        for(int i=0;i<primefactors.size();i++)
        {
            System.out.println(primefactors.get(i));
        }
    }
}
