package synchronize.functionality;

public class Example2 {
    // Mixed out put as all have lock on object with different instance
    public static void main(String[] args) {
        Display1 d1 = new Display1();
        Display1 d2 = new Display1();
        Display1 d3 = new Display1();
        MyThread1 th1 = new MyThread1("Dhoni", d1);
        th1.start();
        MyThread1 th2 = new MyThread1("Yuraj", d2);
        th2.start();
        MyThread1 th3 = new MyThread1("Kholi", d3);
        th3.start();
    }
}

class Display1 {
    public  synchronized void show(String name) {
       for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("My Name:" + name);
        }
    }
}

class MyThread1 extends Thread {
    String name;
    Display1 display;

    MyThread1(String name, Display1 display) {
        this.name = name;
        this.display = display;
    }

    public void run() {
        display.show(this.name);
    }
}