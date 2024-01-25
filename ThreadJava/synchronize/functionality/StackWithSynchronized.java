package synchronize.functionality;

public class StackWithSynchronized {
    private int[] array;
    private int stackTop;
    Object obj;

    public StackWithSynchronized(int capacity) {
        array = new int[capacity];
        stackTop = -1;
        this.obj = new Object();
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= array.length - 1;
    }

    public boolean push(int element) {
        synchronized (String.class) {
            if (isFull()) return false;
            ++stackTop;
            try {
                Thread.sleep(1000);
                System.out.println("Push name::"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            array[stackTop] = element;
            return true;
        }
    }

    public int pop() {
        synchronized (this) {
        if (isEmpty()) return Integer.MIN_VALUE;
        int obj = array[stackTop];
        array[stackTop] = Integer.MIN_VALUE;
        try {
            System.out.println("Pop::"+Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        stackTop--;
        return obj;}
    }
}
