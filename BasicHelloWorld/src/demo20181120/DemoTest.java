package demo20181120;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/11/23.
 */
public class DemoTest {

    public static void main(String[] args) {
//        String str = "2018-01-01";
//        System.out.println(str.indexOf("-"));
//        System.out.println(str.substring(0,str.indexOf("-")));



        System.out.println(new SimpleDateFormat("yyyy").format(new Date()));
    }

}
