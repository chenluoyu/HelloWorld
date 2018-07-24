package demo20180723;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/7/24.
 6.map
     如果有一个函数可以将一种类型的值转换成另外一种类型
     map 操作就可以使用该函数，将一个流中的值转换成一个新的流
     需求：将字符串全转换成大写
 */
public class Demo06 {
    public static void main(String[] args) {
        // 创建集合
        List<String> list = new ArrayList<>();

        // 添加元素
        list.add("sdf");
        list.add("a");
        list.add("asdf");
        list.add("d");
        list.add("basdfgh");

        // 转换为大写
        List<String> list2 = list.stream().map((s) -> s.toUpperCase()).collect(Collectors.toList());

        list2.forEach(System.out :: println);

    }

}
