package synchronize.functionality;

public class Example2WithStatic {
    // Mixed out put as all have lock on object with different instance
    public static void main(String[] args) {
        Display2 d1 = new Display2();
        Display2 d2 = new Display2();
        Display2 d3 = new Display2();
        MyThread2 th1 = new MyThread2("Dhoni", d1);
        th1.start();
        MyThread3 th2 = new MyThread3("Yuraj", d2);
        th2.start();
        MyThread2 th3 = new MyThread2("Kholi", d3);
        th3.start();
    }
}

class Display2 {
    public static synchronized void show(String name) {
       for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("My Name:" + name);
        }
    }
    public static synchronized void show2(String name) {
        for (int i = 0; i < 10; i++) {

            System.out.println("My Name:" + name);
        }
    }


}

class MyThread2 extends Thread {
    String name;
    Display2 display;

    MyThread2(String name, Display2 display) {
        this.name = name;
        this.display = display;
    }

    public void run() {
        display.show(this.name);
    }
}
class MyThread3 extends Thread {
    String name;
    Display2 display;

    MyThread3(String name, Display2 display) {
        this.name = name;
        this.display = display;
    }

    public void run() {
        display.show2(this.name);
    }
}