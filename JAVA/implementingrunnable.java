public class implementingrunnable implements Runnable{
  public void run(){
    System.out.println("Thread started running");
  }
  public static void main(String args[])
  {
    implementingrunnable t1=new implementingrunnable();
    Thread thr=new Thread(t1);
    thr.start();
  }
}
