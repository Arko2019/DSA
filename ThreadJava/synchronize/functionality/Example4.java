package synchronize.functionality;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
MyThread th=new MyThread();
        th.start();
        Thread.sleep(1000);
        System.out.println(th.total);
    }

   public  static  class  MyThread extends Thread {

        int total = 0;

        public void run() {
            for (int i = 0; i < 10; i++) {
                total += i;
            }
        }

    }
}
