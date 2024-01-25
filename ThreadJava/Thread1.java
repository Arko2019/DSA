public class Thread1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("In Thread");
        }
    }
}
