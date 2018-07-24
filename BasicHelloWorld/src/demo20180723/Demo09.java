package demo20180723;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 2018/7/24.
 9.max和min
    获取Stream中最大值或最小值，获取字符串List中长度最长的字符串长度
 */
public class Demo09 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("ab");
        list.add("abcd");
        list.add("abcde");

        // 获取最大值
        int max = list.stream().map((s) -> s.length()).max(Integer :: compareTo).get();
        System.out.println(max);

        // 获取最小值，另一种方法
        int min = list.stream().min(Comparator.comparing((s) -> s.length())).get().length();
        System.out.println(min);
    }

}
