package reenantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReenantLock2 {
    public static void main(String[] args) {
        Display d = new Display();
        DisplayWithSynchronization dws = new DisplayWithSynchronization();
        DisplayWithReenantLock dwr=new DisplayWithReenantLock();

//        MyThread th = new MyThread(d, "Dhoni");
//        MyThread th2 = new MyThread(d, "yuvi");
//        th.start();
//        th2.start();

        // With Synchronized
//        MyThreadWithSynchronized th3 = new MyThreadWithSynchronized(dws, "Dhoni");
//        MyThreadWithSynchronized th4 = new MyThreadWithSynchronized(dws, "yuvi");
//        th3.start();
//        th4.start();
        // With ReenantLock
        MyThreadWithReenentLock th5=new MyThreadWithReenentLock(dwr,"Dhoni");
        MyThreadWithReenentLock th6=new MyThreadWithReenentLock(dwr,"yuvi");
        th5.start();
        th6.start();
    }

    public static class MyThread extends Thread {
        Display d;
        String name;

        MyThread(Display d, String name) {
            this.d = d;
            this.name = name;
        }

        public void run() {
            try {
                this.d.show(this.name);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static class MyThreadWithSynchronized extends Thread {
        DisplayWithSynchronization d;
        String name;

        MyThreadWithSynchronized(DisplayWithSynchronization d, String name) {
            this.d = d;
            this.name = name;
        }

        public void run() {
            try {
                this.d.show(this.name);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static class Display {

        void show(String name) throws InterruptedException {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(2000);
                System.out.println(name + " : thread Name: " + Thread.currentThread().getName());
            }
        }
    }



    public static class DisplayWithSynchronization {

        synchronized void show(String name) throws InterruptedException {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(2000);
                System.out.println(name + " : thread Name: " + Thread.currentThread().getName());
            }
        }
    }

    public static class MyThreadWithReenentLock extends Thread {
        DisplayWithReenantLock d;
        String name;

        MyThreadWithReenentLock(DisplayWithReenantLock d, String name) {
            this.d = d;
            this.name = name;
        }

        public void run() {
            try {
                this.d.show(this.name);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static class DisplayWithReenantLock {
        ReentrantLock lock = new ReentrantLock();

        void show(String name) throws InterruptedException {
            lock.lock();
            for (int i = 0; i < 10; i++) {
                Thread.sleep(2000);
                System.out.println(name + " : thread Name: " + Thread.currentThread().getName());
            }

            lock.unlock();
        }
    }

}
