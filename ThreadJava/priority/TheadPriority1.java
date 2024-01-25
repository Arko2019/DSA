package priority;

public class TheadPriority1 {
    public static void main(String[] args) throws InterruptedException {


        MyThread th1=new MyThread();
        th1.setPriority(4);
        th1.setName("Th1");
        th1.start();
        MyThread th=new MyThread();
        th.setPriority(8);
        th.setName("Th");
        th.start();
       // System.out.println("Main::"+Thread.currentThread().getPriority()+": NAME:"+Thread.currentThread().getName());
    }
    public static class MyThread extends Thread{
        public void run(){
            System.out.println("Name::"+Thread.currentThread());
        }
    }

}
