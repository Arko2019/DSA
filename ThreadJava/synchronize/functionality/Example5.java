package synchronize.functionality;

public class Example5 {
    public static void main(String[] args) throws InterruptedException {
      MyThread th=new MyThread();
      th.start();
      Thread.sleep(1000);// iT GIVES CHANCE TO CHILD THREAD
        // DUE TO THIS CHILD THREAD WORK IS DONE CALL NOTIFY AND WILL COME TO DEAD STATE
        // DUE TO THIS MAIN THREAD WILL BE IN WAITING STATE FOR INFINIT TIME AS NOTIFIED HAD CALLED INITIALLY
      synchronized (th){
          System.out.println("Main in wating");
          th.wait();
          System.out.println("Main got notification");
          System.out.println(th.total);
      }

    }
    static class MyThread extends Thread{
        int total=0;
        public void run(){
            synchronized (this){
                System.out.println("child start");
            for(int i=0;i<10;i++){
                total+=i;
            }
                System.out.println("child end");
                this.notify();
            }

        }
    }
}
