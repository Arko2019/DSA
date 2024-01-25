public class DeadLock {
    public static void main(String[] args) {
        String lock1 = "Hello";
        String lock2 = "World";
        Thread th1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("Lock Accquired");
                }
            }
        });
        Thread th2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("Lock Accquired");
                }
            }
        });
        th1.start();
        th2.start();
    }
}
