package demo20180723;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/7/24.
 7.filter
     遍历数据并检查其中的元素。例如获取字符串List中以数字开始的字符集合
 */
public class Demo07 {
    public static void main(String[] args) {
        // 创建集合
        List<String> list = new ArrayList<>();

        // 添加元素
        list.add("1sdf");
        list.add("a");
        list.add("2asdf");
        list.add("d");
        list.add("basdfgh");

        // 获取数字开头的
        List<String> list2 = list.stream().filter((s) -> Character.isDigit(s.charAt(0))).collect(Collectors.toList());

        list2.forEach(System.out::println);
    }



}
