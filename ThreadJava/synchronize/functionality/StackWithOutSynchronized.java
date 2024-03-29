package synchronize.functionality;

public class StackWithOutSynchronized {
    private int[] array;
    private int stackTop;

    public StackWithOutSynchronized(int capacity) {
        array = new int[capacity];
        stackTop = -1;
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= array.length - 1;
    }

    public boolean push(int element) {
        if (isFull()) return false;
        ++stackTop;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        array[stackTop] = element;
        return true;
    }

    public int pop() {
        if (isEmpty()) return Integer.MIN_VALUE;
        int obj = array[stackTop];
        array[stackTop] = Integer.MIN_VALUE;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        stackTop--;
        return obj;
    }
}
