public class ThreadRunableWithOverideStart {
    public static void main(String[] args) {

        MyRunnable r=new MyRunnable();
        Thread th=new Thread(r);
        th.start();

    }
    public static class MyRunnable implements Runnable{
        void start(){
            System.out.println("In Start");
        }
        public void run(){
            System.out.println("In Run");
        }
    }
}
