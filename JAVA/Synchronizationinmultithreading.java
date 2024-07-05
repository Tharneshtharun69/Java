//Schronization in Multithreading
class SynchroniseEx
{
  int stockcounter=0;
  public synchronized void increment()
  {
    stockcounter++;
    System.out.println("Stock Increment "+stockcounter);
  }
  public synchronized void Decrement()
  {
    stockcounter--;
    System.out.println("Stock Decrement "+stockcounter);
  }
}
class  Import extends Thread
{
  SynchroniseEx synchroniseEx;
  Import(SynchroniseEx synchroniseEx)
  {
    this.synchroniseEx=synchroniseEx;
  }
  public void run()
  {
    for(int i=1; i<=6; i++)
    {
      synchroniseEx.increment();
      System.out.println("Imported Stocks "+i);
      try
      {
        Thread.sleep(2000);
      }
      catch(InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
  }
}
class Export extends Thread
{
  SynchroniseEx synchroniseEx;
  Export(SynchroniseEx synchroniseEx)
  {
    this.synchroniseEx=synchroniseEx;
  }
  public void run()
  {
    for(int i=1; i<=6; i++)
    {
      synchroniseEx.Decrement();
      System.out.println("Exported Stocks "+i);
      try
      {
        Thread.sleep(2000);
      }
      catch(InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
  }
}
class Synchronizationinmultithreading 
{
  public static void main(String[] args)
  {
    Import i = new Import(new SynchroniseEx());
    Export e = new Export(new SynchroniseEx());
    i.start();
    e.start();
  }
}
