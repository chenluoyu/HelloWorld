package demo20180723;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/7/24.
 11.练习
     a.获取Student集合中年龄小于20岁的集合中年龄最大的学生信息
        1、年龄小于20
        2、年龄最大
 */
public class Demo11 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student s1 = new Student("张三",21);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",18);
        Student s4 = new Student("程六",17);
        Student s5 = new Student("赵七",20);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        // 筛选
        Student student = list.stream().filter((s) -> s.getAge() < 20).max(Comparator.comparing((s) -> s.getAge()))
                .get();
        System.out.println(student);

        // 筛选
        List<Student> collect = list.stream().filter((s) -> s.getAge() < 20).collect(Collectors.toList());
        collect.forEach(System.out::println);
        Student student1 = collect.stream().max(Comparator.comparing((s) -> s.getAge())).get();
        System.out.println(student1.toString());
    }


}
