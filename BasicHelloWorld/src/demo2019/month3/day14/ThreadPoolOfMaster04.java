package demo2019.month3.day14;
import org.junit.Test;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPoolOfMaster04 {

    private static double d = 0;
    private Object object = new Object();
    Lock lock = new ReentrantLock();

    @Test
    public void main() {
        ExecutorService executorService = Executors.newFixedThreadPool(500);
        ThreadPoolExecutor tpe = ((ThreadPoolExecutor) executorService);
        for (int i = 0; i < 1000; i++) {
            Future future = executorService.submit(new aaa());
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /**
     * 锁修饰的方法带参数的时候；锁住时，参数的值已定，无法再次修改
     * @param
     * @return
     */
    private static synchronized double go(double d) {
        d = d + 1;
//        System.out.println(d);
        return d;
    }


    class aaa implements Callable {

        public Object call() throws Exception {
            d = go(d);
//            System.out.println(d);
            return null;
        }
    }
}
