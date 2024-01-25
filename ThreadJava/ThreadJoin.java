public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        MyThread th = new MyThread();
        th.start();
        th.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("in main::" + i);
        }
    }

    public static class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("in Run::" + i);
            }
        }
    }
}
