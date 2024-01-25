package ThreadFunctionality;

public class ThreadExample6 {
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        Thread t1 = new Thread(m, "Thread1");
        Thread t2 = new Thread(m, "Thread2");
        t1.start();
        t2.start();
        System.out.println("Main Thread End");

    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(2000);
                    System.out.println(i+": In Runnable:" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
