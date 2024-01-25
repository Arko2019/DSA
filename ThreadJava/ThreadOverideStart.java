public class ThreadOverideStart {
    public static void main(String[] args) {
       MyThread th=new MyThread();
       th.start();
    }
   public static class MyThread extends Thread{
        @Override
       public void start(){
            super.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("In start");
        }
        public void run(){
            System.out.println("In run");
        }
    }
}
