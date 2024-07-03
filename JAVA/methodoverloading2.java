class methodoverloading2
{
  void sum(int a,int b,int c)
  {
    System.out.println(a+b+c);
  }
  void sum(int a,int b)
  {
    System.out.println(a+b);
  }
  public static void main(String args[])
  {
    methodoverloading2 m=new methodoverloading2();
    m.sum(1,2,3);
    m.sum(1,2);
  }
}
