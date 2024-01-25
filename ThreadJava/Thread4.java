public class Thread4 {
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("In runnable thread4");
            }
        };
        Thread th=new Thread(r);
        th.run();
    }
}
