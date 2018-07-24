package demo20180723;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2018/7/24.
    b.查找集合中以a开头的字符的长度集合
 */
public class Demo12 {
    public static void main(String[] args) {
        List<Integer> list = Stream.of("abc", "b", "a", "abcd").filter((s) -> s.startsWith("a")).map((s) -> s.length())
                .collect(Collectors.toList());
        System.out.println(list);
    }


}
