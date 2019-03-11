package demo2019.month2.day13;

public class Demo01 {

    public static void main(String[] args) {

        String theme = "测试";
        int beginIndex = theme.indexOf(") 第");
        System.out.println("beginIndex:"+beginIndex);
        int lastIndex = theme.indexOf("条管理对账单");
        System.out.println("lastIndex:"+lastIndex);
        beginIndex = -3;
        lastIndex = 0;
        String s = theme.substring(beginIndex + 3, lastIndex);
        System.out.println("s:"+s);

    }


}
