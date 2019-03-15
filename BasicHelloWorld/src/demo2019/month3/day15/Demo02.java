package demo2019.month3.day15;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo02 {


    public static void main(String[] args) {

        SynchronizedDemo01 demo01 = new SynchronizedDemo01();
        SynchronizedDemo01 demo02 = new SynchronizedDemo01();
        ExecutorService executorService = Executors.newFixedThreadPool(100);

        for (int i=1;i<=120;i++){
            int a = i;

            executorService.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    demo01.test09(a);
                    return null;
                }
            });
            executorService.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    demo02.test08(a);
                    return null;
                }
            });
        }

        executorService.shutdown();

    }

    /**
     * 当前 test08;test09两个方法均为对象锁；test08 锁方法；test09 锁代码块；
     *  当先执行test08时，test09的执行会被影响？
     *
     *
     */

}
