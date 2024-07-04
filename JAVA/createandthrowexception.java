class createandthrowexception
{
  static void fun()
  {
    try
    {
      throw new ArithmeticException("Arithmetic Exception");
    }
    catch(ArithmeticException e)
    {
      System.out.println("Exception Handled in method");
      throw e;
    }
  }
  public static void main(String args[])
  {
    try{
      fun();
    }
    catch(Exception e){
      System.out.println("Exception Handled in Main");
    }
    finally{
      System.out.println("Hello");
    }
  }
}
