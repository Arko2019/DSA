package producer.consumer;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private Queue<Integer> q;
    private int capacity;

    public BlockingQueue(int cap) {
        this.capacity = cap;
        this.q = new LinkedList<>();

    }

    public boolean add(int iteam) throws InterruptedException {
        synchronized (this.q) {
            Thread.sleep(1000);
            while (q.size() == capacity) {
                System.out.println("Thread ADD"+Thread.currentThread());
                q.wait();
            }
            q.add(iteam);
            System.out.println("Thread add:In notify: "+Thread.currentThread());
           q.notifyAll();
            return true;
        }
    }

    public int remove() throws InterruptedException {
        synchronized (this.q) {
            Thread.sleep(1000);
            while (q.size() == 0) {
                System.out.println("Thread remove:In Wait: "+Thread.currentThread());
                q.wait();
            }
            int result = q.poll();
            q.notifyAll();
            System.out.println("Thread remove:In notify: "+Thread.currentThread());
            return result;
        }
    }
}
