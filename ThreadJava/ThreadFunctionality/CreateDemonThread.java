package ThreadFunctionality;

public class CreateDemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread th=new Thread(()->{
            while (true){
                System.out.println("In thread:"+Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"Thread1");
        th.setDaemon(true);// We we dont set it as demon thread it will continously
                           // call although its out of the method
        th.start();
        Thread.sleep(3000);
        System.out.println("Main Thread End:"+Thread.currentThread().getName());
    }
}
