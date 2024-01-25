package synchronize.functionality;

public class ThreadDemo1 {
    public static void main(String[] args) {
        StackWithSynchronized stack=new StackWithSynchronized(5);
        new Thread(()->{
            int count=0;
            while(++count<10){
                System.out.println("Published:"+stack.push(1000));
              //  System.out.println("pop:"+stack.pop());
            }
        },"Publisher").start();
        new Thread(()->{
            int count=0;
            while(++count<10){
                System.out.println("pop:"+stack.pop());
            }
        },"Poper").start();

    }
}
