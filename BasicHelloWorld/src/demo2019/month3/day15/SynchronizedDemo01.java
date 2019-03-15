package demo2019.month3.day15;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 对 java 锁synchronized
 */
public class SynchronizedDemo01 {


    static {

    }

    public synchronized void test01(){
        int i = 10;
        while (i-- > 0){
            System.out.println(Thread.currentThread().getName() + "-test01-"+this.toString()+"---sync:"+i);
        }
    }

    public void test02(){
        synchronized (this) {
            int i = 10;
            while (i-- > 0){
                System.out.println(Thread.currentThread().getName() + "-test02-"+this.toString()+"---sync:"+i);
            }
        }
    }

    public void test04(){
        synchronized (this) {
            int i = 10;
            while (i-- > 0){
                System.out.println(Thread.currentThread().getName() + "----------sync:"+i);
            }
        }
    }

    public static synchronized void test03(){
        int i = 10;
        while (i-- > 0){
            System.out.println(Thread.currentThread().getName() + "----------static sync:"+i);
        }
    }


    public synchronized void test08(int i){
        System.out.println(Thread.currentThread().getName() + "-test08-"+this.toString()+"-syncMethod:"+i);
    }

    public void test09(int i){
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "-test09-"+this.toString()+"-syncCode:"+i);
        }
    }

}
