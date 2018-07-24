package demo20180723;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Administrator on 2018/7/24.
 什么是Lambda表达式
     带有参数变量的表达式，是一段可以传递的代码，可以被一次或多次执行
     是一种精简的字面写法，其实就是把匿名内部类中“一定”要做的工作省略掉
     然后由JVM通过推导把简化的表达式还原
 格式：  (parameters参数) -> expression表达式或方法体
 paramaters：
     类似方法中的形参列表，这里的参数是函数式接口里的参数
     ->：可理解为“被用于”的意思
 方法体：
     可以是表达式也可以代码块，是函数式接口里方法的实现
     如果负责运算的代码无法用表达式表示，可以使用编写方法实现
     但必须用{}包围并按需明确使用 return语句
 需求：对字符串数组按字符串长度排序
 */
public class Demo1 {

    public static void main(String[] args) {
        // 定义字符串数组
        String[] strArr = { "abc", "cd", "abce", "a" };

        // 传统方法
        // 匿名内部类
        Arrays.sort(strArr, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length());
            }
        });

        // 输出排序结果
        for (String s : strArr) {
            System.out.println(s);
        }
        System.out.println("---------------------");

        // Lambda表达式
        Arrays.sort(strArr, (s1, s2) -> Integer.compare(s2.length(), s1.length()));

        // 输出
        for (String s : strArr) {
            System.out.println(s);
        }
    }


}
