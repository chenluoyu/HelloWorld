package demo2019.month3.day15;

import javafx.concurrent.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Demo01 {


    public static void main(String[] args) {

        SynchronizedDemo01 demo01 = new SynchronizedDemo01();
        SynchronizedDemo01 demo02 = new SynchronizedDemo01();

        ExecutorService executorService = Executors.newFixedThreadPool(200);
        executorService.submit(new Thread() {
            @Override
            public void run() {
                new SynchronizedDemo01().test01();
//                demo01.test01();
            }
        });
        executorService.submit(new Thread() {
            @Override
            public void run() {
                new SynchronizedDemo01().test02();
//                demo01.test02();
            }
        });

        executorService.shutdownNow();
    }


}
