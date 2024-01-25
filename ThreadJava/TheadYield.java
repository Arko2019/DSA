public class TheadYield {
    public static void main(String[] args) throws InterruptedException {
        MyThread th=new MyThread();
        th.start();

        //th.wait();
        MyThread1 th1=new MyThread1();
        th1.start();

    }
    public static class MyThread extends Thread{
        @Override
        public void run(){
            for(int i=0;i<10;i++){
//                try {
//                    Thread.
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                System.out.println("In Child:"+i);
            }
        }
    }
    public static class MyThread1 extends Thread{
        @Override
        public void run(){
            //Thread.yield();
            for(int i=0;i<10;i++){

                System.out.println("In TH1:"+i);
            }
        }
    }
}
