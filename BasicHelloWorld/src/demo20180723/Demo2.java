package demo20180723;

/**
 * Created by Administrator on 2018/7/24.
 * 需求：用Lambda实现多线程
 */
public class Demo2 {
    public static void main(String[] args) {
        // Lambda表达式
        new Thread(() -> System.out.println(1 + "hello world")).start();

        System.out.println("----------------");

        // 方法体
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(2 + "hello world");
            }
        }).start();
    }

}
