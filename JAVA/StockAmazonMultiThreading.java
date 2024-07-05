class IncomingStock extends Thread{
    public void run(){
        for (int i = 1; i <=6; i++){
            System.out.println("Incoming Stocks "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class DespatchingStock extends Thread {
    public void run() {
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " Despatching Stock");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class StockAmazonMultiThreading{
    public static void main(String[] args) throws InterruptedException {
        IncomingStock is = new IncomingStock();
        DespatchingStock ds = new DespatchingStock();
        is.start();
        ds.start();
        is.join();
        is.interrupt();
        ds.join();
        System.out.println(is.isDaemon());
        System.out.println(is.isAlive());
    }
}
