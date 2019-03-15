package demo2019.month3.day11;

import org.springframework.test.context.util.TestContextResourceUtils;
import org.springframework.util.StopWatch;

public class Demo01 {


    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start("main method start:");

        String[] paths = new String[6];
        paths[0] = "spring0.xml";           // classpath:/demo2019/month3/day11/spring0.xml
        paths[1] = "/spring0.xml";          // classpath:/spring0.xml
        paths[2] = "../spring0.xml";        // classpath:/demo2019/month3/spring0.xml
        paths[3] = "classpath:/spring1.xml";// classpath:/spring1.xml
        paths[4] = "classpath*:/spring2.xml";// classpath*:/spring2.xml
        paths[5] = "";                       // classpath:/demo2019/month3/day11/

        String[] strings = TestContextResourceUtils.convertToClasspathResourcePaths(Demo01.class, paths);
        for (String str : strings){
            System.out.println(str);
        }

        watch.stop();

        System.out.println(watch.prettyPrint());
    }


}
