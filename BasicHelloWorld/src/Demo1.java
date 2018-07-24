/**
 * Created by Administrator on 2018/7/2.
 *
 *
 6.Lambda的优点
     a.极大的减少代码冗余，同时可读性也好过冗长的匿名内部类
    b.与集合类批处理操作结合，实现内部迭代，并充分利用现代多核CPU进行并行计算。之前集合类的迭代都是外部的，即客户代码。而内部迭代意味着由Java类库来进行迭代，而不是客户代码
 7.和匿名内部类的区别
     a.在lambda中，this不是指向lambda表达式产生的那个对象，而是它的外部对象
     b.Java 编译器编译 Lambda 表达式并将他们转化为类里面的私有函数，它使用 Java 7 中新加的 invokedynamic 指令动态绑定该方法，但每一个匿名内部类编译器会为其创建一个类文件
 */
public class Demo1 {

    static boolean foo(char c) {
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {

        int i = 0;
        for (foo('A');foo('B') && (i < 2);foo('C')) {
            i++;
            foo('D');
        }

    }
}
