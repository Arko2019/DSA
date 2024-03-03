package ThreadFunctionality;

public class RaceCondition {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread th1 = new Thread(r, "Thread1");
        Thread th2 = new Thread(r, "Thread2");
        th1.start();
        th2.start();
    }

    public static class MyRunnable implements Runnable {
        int count = 0;

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
            //    synchronized (RaceCondition.class) {
                    this.count++;
             //   }
                // System.out.println("In for:"+count+": Name:"+Thread.currentThread().getName());
            }
            System.out.println("In Runnable:" + this.count + ": name:" + Thread.currentThread().getName());
        }
    }
}
