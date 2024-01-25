public class Thread2 {
    public static void main(String[] args) {
Thread th=new Thread(new MyRunnable());
th.start();
    }
    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("In runable");
        }
    }
}
