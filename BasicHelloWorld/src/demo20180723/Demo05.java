package demo20180723;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/7/24.
 b.collect(toList())
     由Stream 里的值生成一个列表，是一个及早求值操作
     很多Stream 操作都是惰性求值，因此调用Stream 一系列方法之后
     还需最后再调用一个类似collect 的及早求值方法返回集合
     开篇的例子：(再将符合要求的字符串放到一个新的集合里)
     使用filter过滤器：遍历数据并检查其中的元素
 */
public class Demo05 {
    public static void main(String[] args) {
        // 创建集合
        List<String> list = new ArrayList<>();

        // 添加元素
        list.add("sdf");
        list.add("a");
        list.add("asdf");
        list.add("d");
        list.add("basdfgh");

        // 统计长度大于2的
        long count = list.stream().filter((s) -> s.length() > 2).count();

        // 将符合要求的放入集合
        List<String> list2 = list.stream().filter((s) -> s.length() > 2).collect(Collectors.toList());

        System.out.println(count);
        list2.forEach(System.out :: println);
    }


}
