package demo2019.month1.day02;

import java.util.Scanner;

/**
 * 算法应用：斐波那契数列
 */
public class Fbo {

    private static void f(int x){
        int f1=1,f2=1,i=3;
        if(x==1)System.out.print(f1);
        if(x==2)System.out.print(f1+"  "+f2);
        if(x>=3){                 //求位置大于三的数列
            System.out.print(f1+"  "+f2);
            while(x>=i){         //求数列
                f1=f2+f1;        //求两项之和
                System.out.print("  "+f1);
                i++;
                f2=f2+f1;
                System.out.print("  "+f2);
            }
        }
    }
    public static void main(String[] args) {
        /**
         * 说明：斐波那契数列的定义：它的第一项和第二项均为1，以后各项都为前两项之和
         * 难点：如何设计好循环
         */
        Scanner s=new Scanner(System.in);
        System.out.println("请输入你想查看的斐波那契数列个数：");
        int num=s.nextInt();
        System.out.println("你想看的斐波那契数列：");
        f(num/2+1);
    }
}
