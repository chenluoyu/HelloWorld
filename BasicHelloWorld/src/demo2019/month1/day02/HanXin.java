package demo2019.month1.day02;

/**
 * 算法应用：韩信点兵
 */
public class HanXin {

    public static void main(String[] args) {
        /**
         * 案列说明：韩信带兵不足百人，3人一行排列多一人，7人一行排列少两人，5人一行正好，本例是计算韩信究竟点了多少兵？
         * 想法：对于韩信点兵算法，只需将7人少2人转换7人多5人，这样解决问题的方法就很明显了，再限定人数不多于100即可。
         */
        int a=0,b=0,c=0,preson;      //定义总人数和各种站法的剩余人数
        for(preson=0;preson<100;preson++){
            a=preson%3;              //每排三人剩余人数
            b=preson%7;              //每排七人的剩余人数
            c=preson%5;              //每排五人的剩余人数
            if(a==1&&b==5&&c==0){     //都符合条件时的人数
                System.out.println("韩信带的兵数是："+preson);
            }
        }

    }

}
