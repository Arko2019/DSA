public class Thread5 {
    public static void main(String[] args) {
        Runnable r=()->{
            String threadName=Thread.currentThread().getName();
            System.out.println("In Lambda Thread5,Thread Name:"+threadName);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread fininsh,Thread Name:"+threadName);
        };
        Thread th1=new Thread(r,"Thread1");
        th1.start();
        Thread th2=new Thread(r,"Thread2");
        th2.start();
    }
}
