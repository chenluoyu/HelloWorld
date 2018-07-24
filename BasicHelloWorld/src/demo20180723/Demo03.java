package demo20180723;

import java.util.function.Supplier;

/**
 * Created by Administrator on 2018/7/23.
 c.供给型接口：Supplier<T>
     无传入参数，有返回值
     该接口对应的方法类型不接受参数，但是提供一个返回值
     使用get()方法获得这个返回值
 */
public class Demo03 {

    public static void main(String[] args) {
        // 创建字符串
        String str = "hello world";

        // 调用
        String sup = testSup(() -> str);

        System.out.println(sup);
    }

    /**
     *
     * @param sup
     * @return
     */
    public static String testSup(Supplier<String> sup) {
        // 执行
        String s = sup.get();
        return s;
    }

}
