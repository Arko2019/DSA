package synchronize.functionality;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Thread th1 = new Thread(() -> {
            Demo1 demo = new Demo1();
            try {
                demo.getdata();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread1");
        Thread th2 = new Thread(() -> {
            Demo1 demo = new Demo1();
            demo.getdata2();
        }, "Thread2");

        th2.start();
        th1.start();
    }

}

class Demo1 {
    String val = "Hello";

    void getdata() throws InterruptedException {
        synchronized (this) {
            Thread.sleep(1000);
            System.out.println("In getData:" + Thread.currentThread().getName());
        }
    }

    void getdata2() {
        synchronized (this) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("In val getdata2:" + Thread.currentThread().getName());
        }
    }

}