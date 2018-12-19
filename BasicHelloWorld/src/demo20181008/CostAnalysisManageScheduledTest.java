package demo20181008;

import java.io.File;

/**
 * Created by Administrator on 2018/10/8.
 */
public class CostAnalysisManageScheduledTest {


    public static void main(String[] args) throws Exception{

        File file = new File("C:\\Users\\Administrator\\Desktop\\一些资料");
        File[] files = file.listFiles();
        for (File f : files){
            System.out.println("AbsolutePath : " + f.getAbsolutePath());
            System.out.println("Path : " + f.getPath());
        }

    }
}
