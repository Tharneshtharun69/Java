public class extendingthread extends Thread{
  public void run()
  {
    System.out.println("Thread started running");
  }
  public static void main (String[] args) {
    info t1=new info();
    t1.start();
  }
}
