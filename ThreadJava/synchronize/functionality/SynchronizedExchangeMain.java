package synchronize.functionality;

public class SynchronizedExchangeMain {
    public static void main(String[] args) {
        SynchronizedExchanger exchange=new SynchronizedExchanger();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    exchange.setObject(""+i);
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.println(exchange.getObject());
                }
            }
        });
        t1.start();
        t2.start();
    }
}
