class Overloadingmainmethod{
  public static void main(String args[])
  {
    System.out.println("A");
    main(5);
  }
  public static void main(int a)
  {
    System.out.println("B");
  }
}
