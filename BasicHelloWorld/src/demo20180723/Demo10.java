package demo20180723;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/7/24.
 10.reduce
     通过指定的函数把stream中的多个元素汇聚为一个元素，min max等是它的特例
     格式：reduce(初始值，(r, i) -> r + i) 或者 reduce((r, i) -> r + "*" i)
     计算1~100的和
 */
public class Demo10 {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();

        // 封装到集合
        for (long i = 1; i <= 100; i++) {
            list.add(i);
        }

        // 计算
        // reduce：参1，和的初始值
        Long sum = list.stream().parallel().reduce(0L, (r, l) -> r + l);

        System.out.println(sum);
    }

}
