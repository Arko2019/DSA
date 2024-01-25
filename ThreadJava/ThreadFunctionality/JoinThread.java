package ThreadFunctionality;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        Thread th=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Inside thread:"+Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"Thread1");
        th.start();
        th.join();// Once thread1 is done then main thread will execute
        System.out.println("Main Thread End:"+Thread.currentThread().getName());
    }
}
