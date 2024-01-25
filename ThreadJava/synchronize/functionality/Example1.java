package synchronize.functionality;

import priority.TheadPriority1;

public class Example1 {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread th1 = new MyThread("Dhoni", d);
        th1.start();
        MyThread th2 = new MyThread("Yuraj", d);
        th2.start();
        MyThread th3 = new MyThread("Kholi", d);
        th3.start();
    }
}

class Display {
    public synchronized void show(String name) {
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

class MyThread extends Thread {
    String name;
    Display display;

    MyThread(String name, Display display) {
        this.name = name;
        this.display = display;
    }

    public void run() {
        display.show(this.name);
    }
}