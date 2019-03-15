package demo2019.month3.day15;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Demo03DeadSynchronized {

    public static void main(String[] args) {


        Object o1 = new Object();
        Object o2 = new Object();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (o1){
                    try {
                        System.out.println(Thread.currentThread().getName()+":sync...o1");
                        Thread.sleep(500);
                        synchronized(o2){
                            System.out.println(Thread.currentThread().getName()+":sync...o2");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName()+":sync...o2");
                    synchronized(o1){
                        System.out.println(Thread.currentThread().getName()+":sync...o1");
                    }
                }
            }
        };

        t1.start();
        t2.start();

        Executors.newCachedThreadPool();
        ThreadFactory threadFactory = Executors.defaultThreadFactory();


        System.out.println("main end...");
    }

}
