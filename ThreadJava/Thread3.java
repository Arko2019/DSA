public class Thread3 {
    public static void main(String[] args) {

        Thread th=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In Runnable 1");
            }
        });
        th.start();
    }

}
