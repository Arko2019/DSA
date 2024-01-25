package producer.consumer;

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue q=new BlockingQueue(4);
     Thread th1=  new Thread(()->{
            try {

               for(int i=0;i<10;i++){
                   q.add(i);
               }



                System.out.println("add::"+" name"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"Thread1");
     th1.start();
        new Thread(()->{
            try {
              int a=  q.remove();
                System.out.println("Remove::"+a+" name"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"Thread2").start();
        new Thread(()->{
            try {
                int a=  q.remove();
                System.out.println("Remove::"+a+" name"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"Thread3").start();
      Thread th4=  new Thread(()->{
            try {

                for(int i=0;i<10;i++){
                    q.add(i);
                }



                System.out.println("add::"+" name"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"Thread4");
      th4.start();
      while (true){
          Thread.sleep(100);
          System.out.println(th4.getState()+"th4");
          System.out.println(th1.getState()+"th1");
      }

    }
}
