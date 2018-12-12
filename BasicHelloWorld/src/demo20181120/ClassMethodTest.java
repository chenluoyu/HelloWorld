package demo20181120;

import java.lang.reflect.Constructor;

/**
 * Created by Administrator on 2018/11/20.
 */
public class ClassMethodTest {

    public static void main(String[] args){
        System.out.println("Name："+ClassMethodTest.class.getName());
        System.out.println("TypeName："+ClassMethodTest.class.getTypeName());
        System.out.println("SimpleName："+ClassMethodTest.class.getSimpleName());
        System.out.println("CanonicalName："+ClassMethodTest.class.getCanonicalName());

        try {
//            System.err.println(Class.forName("ClassMethodTest.class").getName());
            Class<?> aClass = Class.forName("demo20181120.ClassMethodTest");
            // 获取实例对象
            Object o = aClass.newInstance();
            Constructor<?> constructor = aClass.getConstructor();
            Object o1 = constructor.newInstance();


            System.err.println(aClass.getName());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
