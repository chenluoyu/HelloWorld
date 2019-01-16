package demo2019.month1.day08;

import demo20180723.Student;

public class Demo01 {

    public static void main(String[] args) {

        String theme = "泰禾集团-集团总部-集团信息流程部(2018年12月) 第11条管理对账单";

        int beginIndex = theme.indexOf(") 第");
        System.out.println("beginIndex：" + beginIndex);
        int lastIndex = theme.indexOf("条管理对账单");
        System.out.println("lastIndex：" + lastIndex);
        String s = theme.substring(beginIndex + 3, lastIndex);
        System.out.println(s);


    }

}
