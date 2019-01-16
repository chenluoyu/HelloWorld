package demo2019.month1.day02;

/**
 * 算法应用：百钱买百鸡
 */
public class BQMJ {

    public static void main(String[] args) {
        /**
         * 案列说明：主要内容是：公鸡5元一只，母鸡3元一只，小鸡1元三只，问100元怎样可以买100鸡？
         * 思想：想要实现此算法，只要明白各种条件的关系即可，而且知道公鸡最多买20只，母鸡最多买33只，小鸡最多买100只，这样买各种鸡的钱总为100,元，鸡的只数也是100；
          */
        int cock,hen,chicken = 0;
        // 公鸡最多买20只
        for (cock = 0; cock<= 20; cock++){
            // 母鸡最多买33只
            for (hen = 0; hen <= 33; hen++){
                // 小鸡最多买100只（题目限定）
                chicken = 100 - cock - hen;
                // 注意：小鸡数量需要是3的倍数
                int p;
                p = chicken%3;
                // 总钱100元：
                if (((5*cock+3*hen+chicken/3) == 100) && p == 0){
                    System.out.print("    可以买公鸡的数量："+cock);
                    System.out.print("    可以买母鸡的数量："+hen);
                    System.out.print("    可以买小鸡的数量："+chicken);
                    System.out.print("\n");
                }

            }


        }


    }

}
