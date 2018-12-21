package demo20181221;

public class BaseInitChildDemo extends BaseInitDemo {

    public String whenInit = "when child set";

    BaseInitChildDemo(){
        System.out.println("do BaseInitChildDemo init");
    }

    @Override
    void process() {
        System.out.println("do BaseInitChildDemo process()");
        System.out.println("whenInit = " + whenInit);
        whenInit = "when parent set";
        System.out.println("do whenInit set end");
        System.out.println("whenInit = " + whenInit);
    }


    public static void main(String[] args) {
        /**
         * 一轮 类初始化 加载顺序
         */
        BaseInitChildDemo b = new BaseInitChildDemo();
        System.out.println(b.whenInit);
    }
}
