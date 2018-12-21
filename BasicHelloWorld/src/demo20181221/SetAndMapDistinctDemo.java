package demo20181221;

import demo20180723.Student;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang.ObjectUtils;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 去重问题测试
 */
public class SetAndMapDistinctDemo {

    public static void main(String[] args) {

//        compareObject();

//        compareMapToSet();

        /**
         * 默认的Object的toString返回的是 class的getName()+"@"+Integer.toHexString(hashCode()) 16进制的
         * 如果 JavaBean 没有重写 hashCode() 和 equals(Object o)，则计算出来的hashCode值会不一致。
         *  去重时的判定 就会判定不一致
         */
        Student s1 = new Student();
        s1.setAge(1);
        s1.setName("1");
        System.out.println(s1);
        Student s2 = new Student();
        s2.setAge(1);
        s2.setName("1");
        System.out.println(s2);

        Map<Object,Object> map1 = new HashMap<>();
        map1.put("age",1);
        map1.put("name","1");
        map1.put("st",s1);
        System.out.println(map1);
        Map<Object,Object> map2 = new HashMap<>();
        map2.put("age",1);
        map2.put("name","1");
        map2.put("st",s2);
        System.out.println(map2);

        Set set = new HashSet();
        set.add(map1);
        set.add(map2);
        System.out.println(set.size());

    }

    private static void compareMapToSet() {
        Map<Object,Object> map1 = new HashMap<>();
        map1.put("age",1);
        map1.put("name","1");
        System.out.println(map1);
        Map<Object,Object> map2 = new HashMap<>();
        map2.put("age",1);
        map2.put("name","1");
        System.out.println(map2);

        Set set = new HashSet();
        set.add(map1);
        set.add(map2);
        System.out.println(set.size());
    }

    private static void compareObject() {
        Student s1 = new Student();
        s1.setAge(1);
        s1.setName("1");
        System.out.println(s1 + " " + s1.hashCode());
        Student s2 = new Student();
        s2.setAge(1);
        s2.setName("1");
        System.out.println(s2 + " " + s2.hashCode());

        System.out.println(s1.equals(s2));
        Set set = new HashSet();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());
    }


}
