package demo20180723;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2018/7/24.
 8.flatMap
     可用Stream 替换值， 然后将多个Stream 连接成一个Stream
     map 操作可用一个新的值代替Stream 中的值
     若用户希望让map操作有点变化
     生成一个新的Stream 对象取而代之则flatMap适用
     假设有一个包含多个列表的流，现在希望得到所有数字的序列
 */
public class Demo08 {
    public static void main(String[] args) {

        Stream<?> flatMap = Stream.of(Arrays.asList("a", "b"), Arrays.asList(1, 2, 3)).flatMap((s) -> s.stream());
        flatMap.forEach(System.out :: println);
    }
}
