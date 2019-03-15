package demo2019.month3.day14;
import org.junit.Test;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPoolOfMaster {

    private static double d = 0;
    private Object object = new Object();
    Lock lock = new ReentrantLock();

    @Test
    public void main() {
        ExecutorService executorService = Executors.newFixedThreadPool(500);
        ThreadPoolExecutor tpe = ((ThreadPoolExecutor) executorService);
        for (int i = 0; i < 1000; i++) {
//            aaa aaa = new aaa();
//            System.out.println(i+"===="+aaa.toString());
//            Future future = executorService.submit(aaa);
            Future future = executorService.submit(new aaa());
//            d= d +1;
//            System.out.println(d);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /**
     *
     * @param
     * @return
     */
    private static synchronized double go() {
        d = d + 1;
        return d;
    }


    class aaa implements Callable {

        public Object call() throws Exception {
            ThreadPoolOfMaster.go();
            System.out.println(d);
//            double a = ThreadPoolOfMaster.go(d);
//            System.out.println(a);
//            System.out.println(this.toString()+":"+d);
            return null;
        }
    }
}
