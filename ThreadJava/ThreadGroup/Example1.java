package ThreadGroup;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        ThreadGroup tg1=new ThreadGroup("First Group");
        System.out.println("Prent Name: "+tg1.getParent().getName());
        System.out.println(tg1.getName());
        ThreadGroup tg2=new ThreadGroup(tg1,"Second Group");
       // System.out.println("Prent Name: "+tg2.getParent().getName());
        tg2.setMaxPriority(4);
      //  System.out.println(tg2.getName());
        Thread th=new Thread(tg2,()->{
          //  System.out.println("Runnable::parentName::"+Thread.currentThread().getThreadGroup().getParent().getName());
          //  System.out.println("Runnable::Priority::"+Thread.currentThread().getPriority());
        });
        th.start();
        // Check Sytem thread
        ThreadGroup system=Thread.currentThread().getThreadGroup().getParent();
        
        Thread[]t=new Thread[system.activeCount()];
        system.enumerate(t);
        Arrays.stream(t).forEach(k-> System.out.println(k.getName()));
    }
}
