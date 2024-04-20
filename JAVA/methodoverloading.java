//same name,same type,different parameters
class methodoverloading
{
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String args[])
    {
        methodoverloading m=new methodoverloading();
        m.add(10,20);
        m.add(10,20,30);
    }
}
